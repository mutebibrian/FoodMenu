# FoodMenu
BaseAdapter
BaseAdapter, as it's name implies, is the base class for so many concrete adapter implementations on Android. It is abstract and therefore, cannot be directly instantiated.

If your data source is an ArrayList or array, we can also use the ArrayAdapter construct as an alternative. Note that ArrayAdapter itself extends from BaseAdapter.

Using the BaseAdapter
To use the BaseAdapter with a ListView, a concrete implementation the BaseAdapter class that implements the following methods must be created:

int getCount()
Object getItem(int position)
long getItemId(int position)
View getView(int position, View convertView, ViewGroup parent)
