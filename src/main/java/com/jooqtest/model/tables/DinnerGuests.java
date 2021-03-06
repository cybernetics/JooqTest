/**
 * This class is generated by jOOQ
 */
package com.jooqtest.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DinnerGuests extends org.jooq.impl.TableImpl<com.jooqtest.model.tables.records.DinnerGuestsRecord> {

	private static final long serialVersionUID = -1830945678;

	/**
	 * The singleton instance of <code>jooqtest.dinner_guests</code>
	 */
	public static final com.jooqtest.model.tables.DinnerGuests DINNER_GUESTS = new com.jooqtest.model.tables.DinnerGuests();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.jooqtest.model.tables.records.DinnerGuestsRecord> getRecordType() {
		return com.jooqtest.model.tables.records.DinnerGuestsRecord.class;
	}

	/**
	 * The column <code>jooqtest.dinner_guests.id</code>.
	 */
	public final org.jooq.TableField<com.jooqtest.model.tables.records.DinnerGuestsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>jooqtest.dinner_guests.name</code>.
	 */
	public final org.jooq.TableField<com.jooqtest.model.tables.records.DinnerGuestsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>jooqtest.dinner_guests</code> table reference
	 */
	public DinnerGuests() {
		this("dinner_guests", null);
	}

	/**
	 * Create an aliased <code>jooqtest.dinner_guests</code> table reference
	 */
	public DinnerGuests(java.lang.String alias) {
		this(alias, com.jooqtest.model.tables.DinnerGuests.DINNER_GUESTS);
	}

	private DinnerGuests(java.lang.String alias, org.jooq.Table<com.jooqtest.model.tables.records.DinnerGuestsRecord> aliased) {
		this(alias, aliased, null);
	}

	private DinnerGuests(java.lang.String alias, org.jooq.Table<com.jooqtest.model.tables.records.DinnerGuestsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.jooqtest.model.Jooqtest.JOOQTEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.jooqtest.model.tables.records.DinnerGuestsRecord> getPrimaryKey() {
		return com.jooqtest.model.Keys.KEY_DINNER_GUESTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.jooqtest.model.tables.records.DinnerGuestsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.jooqtest.model.tables.records.DinnerGuestsRecord>>asList(com.jooqtest.model.Keys.KEY_DINNER_GUESTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.jooqtest.model.tables.DinnerGuests as(java.lang.String alias) {
		return new com.jooqtest.model.tables.DinnerGuests(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.jooqtest.model.tables.DinnerGuests rename(java.lang.String name) {
		return new com.jooqtest.model.tables.DinnerGuests(name, null);
	}
}
