import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.bodyconditionsystem.Details
import com.example.android.bodyconditionsystem.R

class CustomAdapter(private val dataSet: List<Details>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewTagNumber: TextView = view.findViewById(R.id.tag_number)
        val textViewOverallBSV: TextView = view.findViewById(R.id.overall_bcv)
        val textViewFeed: TextView = view.findViewById(R.id.feed)


    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val details = dataSet[position]
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textViewTagNumber.text = "Tag Number: " + details.tag_number.toString()
        viewHolder.textViewOverallBSV.text = "Overall BSV: " + details.overall_bsv.toString()
        viewHolder.textViewFeed.text = "Feed: "+ details.feed

    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
