package xbean.__;

import com.goldhuman.Common.Marshal.MarshalException;
import com.goldhuman.Common.Marshal.OctetsStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ppbio.CodedInputStream;
import ppbio.CodedOutputStream;
import ppbio.InvalidProtocolBufferException;
import ppbio.Message;
import xbean.BasicPropertiesSystem;
import xbean.CoinInfo;
import xbean.GatherMapItemInfo;
import xbean.Location;
import xbean.Pod;
import xbean.TransferOccupationPropertiesSys;
import xdb.Bean;
import xdb.Consts;
import xdb.Log;
import xdb.LogKey;
import xdb.Logs;
import xdb.XBean;
import xdb.logs.Listenable;
import xdb.logs.ListenableBean;
import xdb.logs.ListenableChanged;
import xdb.logs.ListenableMap;
import xdb.logs.ListenableSet;
import xdb.logs.LogInt;
import xdb.logs.LogLong;
import xdb.util.SetX;

public final class Properties extends XBean implements xbean.Properties {
    private int level;
    private int exp;
    private int hp;
    private int mp;
    private int anger;
    private int vigor;
    private HashMap<Integer, BasicPropertiesSystem> propertysysmap;
    private int activitybpsys;
    private int todaypropsysswitchcount;
    private long timestamp;
    private Location location;
    private long gold;
    private long silver;
    private long goldingot;
    private int dyecolorid;
    private int baoshidu;
    private long lastlogintime;
    private long lastlogofftime;
    private long keeponlinetime;
    private int fightvalue;
    private long leveluptime;
    private long accumulateleveluptime;
    private long vigorrefreshtime;
    private int convertxiulianexp;
    private SetX<Long> compensates;
    private HashMap<Integer, GatherMapItemInfo> gather_map_item_infos;
    private long lastcalcuatetime;
    private int dayonlineseconds;
    private long onlineseconds;
    private int send_recharge_times_tip_mail_no;
    private long levelupcurtime;
    private HashMap<Integer, TransferOccupationPropertiesSys> transfer_occupation_property_sys_map;
    private HashMap<Integer, CoinInfo> coins;

    public void _reset_unsafe_() {
        this.level = 0;
        this.exp = 0;
        this.hp = 0;
        this.mp = 0;
        this.anger = 0;
        this.vigor = 0;
        this.propertysysmap.clear();
        this.activitybpsys = 0;
        this.todaypropsysswitchcount = 0;
        this.timestamp = 0L;
        this.location._reset_unsafe_();
        this.gold = 0L;
        this.silver = 0L;
        this.goldingot = 0L;
        this.dyecolorid = 0;
        this.baoshidu = 0;
        this.lastlogintime = 0L;
        this.lastlogofftime = 0L;
        this.keeponlinetime = 0L;
        this.fightvalue = 0;
        this.leveluptime = 0L;
        this.accumulateleveluptime = 0L;
        this.vigorrefreshtime = 0L;
        this.convertxiulianexp = 0;
        this.compensates.clear();
        this.gather_map_item_infos.clear();
        this.lastcalcuatetime = 0L;
        this.dayonlineseconds = 0;
        this.onlineseconds = 0L;
        this.send_recharge_times_tip_mail_no = 0;
        this.levelupcurtime = 0L;
        this.transfer_occupation_property_sys_map.clear();
        this.coins.clear();
    }

    Properties(int __, XBean _xp_, String _vn_) {
        super(_xp_, _vn_);
        this.level = 0;
        this.exp = 0;
        this.hp = 0;
        this.mp = 0;
        this.anger = 0;
        this.vigor = 0;
        this.propertysysmap = new HashMap();
        this.location = new xbean.__.Location(0, this, "location");
        this.compensates = new SetX();
        this.gather_map_item_infos = new HashMap();
        this.send_recharge_times_tip_mail_no = 0;
        this.transfer_occupation_property_sys_map = new HashMap();
        this.coins = new HashMap();
    }

    public Properties() {
        this(0, (XBean)null, (String)null);
    }

    public Properties(Properties _o_) {
        this(_o_, (XBean)null, (String)null);
    }

    Properties(xbean.Properties _o1_, XBean _xp_, String _vn_) {
        super(_xp_, _vn_);
        if (_o1_ instanceof Properties) {
            this.assign((Properties)_o1_);
        } else if (_o1_ instanceof Data) {
            this.assign((Data)_o1_);
        } else {
            if (!(_o1_ instanceof Const)) {
                throw new UnsupportedOperationException();
            }

            this.assign(((Const)_o1_).nThis());
        }

    }

    private void assign(Properties _o_) {
        _o_._xdb_verify_unsafe_();
        this.level = _o_.level;
        this.exp = _o_.exp;
        this.hp = _o_.hp;
        this.mp = _o_.mp;
        this.anger = _o_.anger;
        this.vigor = _o_.vigor;
        this.propertysysmap = new HashMap();
        Iterator i$ = _o_.propertysysmap.entrySet().iterator();

        Map.Entry _e_;
        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem((BasicPropertiesSystem)_e_.getValue(), this, "propertysysmap"));
        }

        this.activitybpsys = _o_.activitybpsys;
        this.todaypropsysswitchcount = _o_.todaypropsysswitchcount;
        this.timestamp = _o_.timestamp;
        this.location = new xbean.__.Location(_o_.location, this, "location");
        this.gold = _o_.gold;
        this.silver = _o_.silver;
        this.goldingot = _o_.goldingot;
        this.dyecolorid = _o_.dyecolorid;
        this.baoshidu = _o_.baoshidu;
        this.lastlogintime = _o_.lastlogintime;
        this.lastlogofftime = _o_.lastlogofftime;
        this.keeponlinetime = _o_.keeponlinetime;
        this.fightvalue = _o_.fightvalue;
        this.leveluptime = _o_.leveluptime;
        this.accumulateleveluptime = _o_.accumulateleveluptime;
        this.vigorrefreshtime = _o_.vigorrefreshtime;
        this.convertxiulianexp = _o_.convertxiulianexp;
        this.compensates = new SetX();
        this.compensates.addAll(_o_.compensates);
        this.gather_map_item_infos = new HashMap();
        i$ = _o_.gather_map_item_infos.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo((GatherMapItemInfo)_e_.getValue(), this, "gather_map_item_infos"));
        }

        this.lastcalcuatetime = _o_.lastcalcuatetime;
        this.dayonlineseconds = _o_.dayonlineseconds;
        this.onlineseconds = _o_.onlineseconds;
        this.send_recharge_times_tip_mail_no = _o_.send_recharge_times_tip_mail_no;
        this.levelupcurtime = _o_.levelupcurtime;
        this.transfer_occupation_property_sys_map = new HashMap();
        i$ = _o_.transfer_occupation_property_sys_map.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys((TransferOccupationPropertiesSys)_e_.getValue(), this, "transfer_occupation_property_sys_map"));
        }

        this.coins = new HashMap();
        i$ = _o_.coins.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.coins.put(_e_.getKey(), new xbean.__.CoinInfo((CoinInfo)_e_.getValue(), this, "coins"));
        }

    }

    private void assign(Data _o_) {
        this.level = _o_.level;
        this.exp = _o_.exp;
        this.hp = _o_.hp;
        this.mp = _o_.mp;
        this.anger = _o_.anger;
        this.vigor = _o_.vigor;
        this.propertysysmap = new HashMap();
        Iterator i$ = _o_.propertysysmap.entrySet().iterator();

        Map.Entry _e_;
        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem((BasicPropertiesSystem)_e_.getValue(), this, "propertysysmap"));
        }

        this.activitybpsys = _o_.activitybpsys;
        this.todaypropsysswitchcount = _o_.todaypropsysswitchcount;
        this.timestamp = _o_.timestamp;
        this.location = new xbean.__.Location(_o_.location, this, "location");
        this.gold = _o_.gold;
        this.silver = _o_.silver;
        this.goldingot = _o_.goldingot;
        this.dyecolorid = _o_.dyecolorid;
        this.baoshidu = _o_.baoshidu;
        this.lastlogintime = _o_.lastlogintime;
        this.lastlogofftime = _o_.lastlogofftime;
        this.keeponlinetime = _o_.keeponlinetime;
        this.fightvalue = _o_.fightvalue;
        this.leveluptime = _o_.leveluptime;
        this.accumulateleveluptime = _o_.accumulateleveluptime;
        this.vigorrefreshtime = _o_.vigorrefreshtime;
        this.convertxiulianexp = _o_.convertxiulianexp;
        this.compensates = new SetX();
        this.compensates.addAll(_o_.compensates);
        this.gather_map_item_infos = new HashMap();
        i$ = _o_.gather_map_item_infos.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo((GatherMapItemInfo)_e_.getValue(), this, "gather_map_item_infos"));
        }

        this.lastcalcuatetime = _o_.lastcalcuatetime;
        this.dayonlineseconds = _o_.dayonlineseconds;
        this.onlineseconds = _o_.onlineseconds;
        this.send_recharge_times_tip_mail_no = _o_.send_recharge_times_tip_mail_no;
        this.levelupcurtime = _o_.levelupcurtime;
        this.transfer_occupation_property_sys_map = new HashMap();
        i$ = _o_.transfer_occupation_property_sys_map.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys((TransferOccupationPropertiesSys)_e_.getValue(), this, "transfer_occupation_property_sys_map"));
        }

        this.coins = new HashMap();
        i$ = _o_.coins.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            this.coins.put(_e_.getKey(), new xbean.__.CoinInfo((CoinInfo)_e_.getValue(), this, "coins"));
        }

    }

    public final OctetsStream marshal(OctetsStream _os_) {
        this._xdb_verify_unsafe_();
        _os_.marshal(this.level);
        _os_.marshal(this.exp);
        _os_.marshal(this.hp);
        _os_.marshal(this.mp);
        _os_.marshal(this.anger);
        _os_.marshal(this.vigor);
        _os_.compact_uint32(this.propertysysmap.size());
        Iterator i$ = this.propertysysmap.entrySet().iterator();

        Map.Entry _e_;
        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            _os_.marshal((Integer)_e_.getKey());
            ((BasicPropertiesSystem)_e_.getValue()).marshal(_os_);
        }

        _os_.marshal(this.activitybpsys);
        _os_.marshal(this.todaypropsysswitchcount);
        _os_.marshal(this.timestamp);
        this.location.marshal(_os_);
        _os_.marshal(this.gold);
        _os_.marshal(this.silver);
        _os_.marshal(this.goldingot);
        _os_.marshal(this.dyecolorid);
        _os_.marshal(this.baoshidu);
        _os_.marshal(this.lastlogintime);
        _os_.marshal(this.lastlogofftime);
        _os_.marshal(this.keeponlinetime);
        _os_.marshal(this.fightvalue);
        _os_.marshal(this.leveluptime);
        _os_.marshal(this.accumulateleveluptime);
        _os_.marshal(this.vigorrefreshtime);
        _os_.marshal(this.convertxiulianexp);
        _os_.compact_uint32(this.compensates.size());
        i$ = this.compensates.iterator();

        while(i$.hasNext()) {
            Long _v_ = (Long)i$.next();
            _os_.marshal(_v_);
        }

        _os_.compact_uint32(this.gather_map_item_infos.size());
        i$ = this.gather_map_item_infos.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            _os_.marshal((Integer)_e_.getKey());
            ((GatherMapItemInfo)_e_.getValue()).marshal(_os_);
        }

        _os_.marshal(this.lastcalcuatetime);
        _os_.marshal(this.dayonlineseconds);
        _os_.marshal(this.onlineseconds);
        _os_.marshal(this.send_recharge_times_tip_mail_no);
        _os_.marshal(this.levelupcurtime);
        _os_.compact_uint32(this.transfer_occupation_property_sys_map.size());
        i$ = this.transfer_occupation_property_sys_map.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            _os_.marshal((Integer)_e_.getKey());
            ((TransferOccupationPropertiesSys)_e_.getValue()).marshal(_os_);
        }

        _os_.compact_uint32(this.coins.size());
        i$ = this.coins.entrySet().iterator();

        while(i$.hasNext()) {
            _e_ = (Map.Entry)i$.next();
            _os_.marshal((Integer)_e_.getKey());
            ((CoinInfo)_e_.getValue()).marshal(_os_);
        }

        return _os_;
    }

    public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
        this._xdb_verify_unsafe_();
        this.level = _os_.unmarshal_int();
        this.exp = _os_.unmarshal_int();
        this.hp = _os_.unmarshal_int();
        this.mp = _os_.unmarshal_int();
        this.anger = _os_.unmarshal_int();
        this.vigor = _os_.unmarshal_int();
        int size = _os_.uncompact_uint32();
        if (size >= 12) {
            this.propertysysmap = new HashMap(size * 2);
        }

        boolean _k_;
        int _k_;
        while(size > 0) {
            _k_ = false;
            _k_ = _os_.unmarshal_int();
            BasicPropertiesSystem _v_ = new xbean.__.BasicPropertiesSystem(0, this, "propertysysmap");
            _v_.unmarshal(_os_);
            this.propertysysmap.put(_k_, _v_);
            --size;
        }

        this.activitybpsys = _os_.unmarshal_int();
        this.todaypropsysswitchcount = _os_.unmarshal_int();
        this.timestamp = _os_.unmarshal_long();
        this.location.unmarshal(_os_);
        this.gold = _os_.unmarshal_long();
        this.silver = _os_.unmarshal_long();
        this.goldingot = _os_.unmarshal_long();
        this.dyecolorid = _os_.unmarshal_int();
        this.baoshidu = _os_.unmarshal_int();
        this.lastlogintime = _os_.unmarshal_long();
        this.lastlogofftime = _os_.unmarshal_long();
        this.keeponlinetime = _os_.unmarshal_long();
        this.fightvalue = _os_.unmarshal_int();
        this.leveluptime = _os_.unmarshal_long();
        this.accumulateleveluptime = _os_.unmarshal_long();
        this.vigorrefreshtime = _os_.unmarshal_long();
        this.convertxiulianexp = _os_.unmarshal_int();

        for(size = _os_.uncompact_uint32(); size > 0; --size) {
            long _v_ = 0L;
            _v_ = _os_.unmarshal_long();
            this.compensates.add(_v_);
        }

        size = _os_.uncompact_uint32();
        if (size >= 12) {
            this.gather_map_item_infos = new HashMap(size * 2);
        }

        while(size > 0) {
            _k_ = false;
            _k_ = _os_.unmarshal_int();
            GatherMapItemInfo _v_ = new xbean.__.GatherMapItemInfo(0, this, "gather_map_item_infos");
            _v_.unmarshal(_os_);
            this.gather_map_item_infos.put(_k_, _v_);
            --size;
        }

        this.lastcalcuatetime = _os_.unmarshal_long();
        this.dayonlineseconds = _os_.unmarshal_int();
        this.onlineseconds = _os_.unmarshal_long();
        this.send_recharge_times_tip_mail_no = _os_.unmarshal_int();
        this.levelupcurtime = _os_.unmarshal_long();
        size = _os_.uncompact_uint32();
        if (size >= 12) {
            this.transfer_occupation_property_sys_map = new HashMap(size * 2);
        }

        while(size > 0) {
            _k_ = false;
            _k_ = _os_.unmarshal_int();
            TransferOccupationPropertiesSys _v_ = new xbean.__.TransferOccupationPropertiesSys(0, this, "transfer_occupation_property_sys_map");
            _v_.unmarshal(_os_);
            this.transfer_occupation_property_sys_map.put(_k_, _v_);
            --size;
        }

        size = _os_.uncompact_uint32();
        if (size >= 12) {
            this.coins = new HashMap(size * 2);
        }

        while(size > 0) {
            _k_ = false;
            _k_ = _os_.unmarshal_int();
            CoinInfo _v_ = new xbean.__.CoinInfo(0, this, "coins");
            _v_.unmarshal(_os_);
            this.coins.put(_k_, _v_);
            --size;
        }

        return _os_;
    }

    public int getSerializedSize() {
        this._xdb_verify_unsafe_();
        int _size_ = 0;
        _size_ += CodedOutputStream.computeInt32Size(1, this.level);
        _size_ += CodedOutputStream.computeInt32Size(2, this.exp);
        _size_ += CodedOutputStream.computeInt32Size(3, this.hp);
        _size_ += CodedOutputStream.computeInt32Size(4, this.mp);
        _size_ += CodedOutputStream.computeInt32Size(5, this.anger);
        _size_ += CodedOutputStream.computeInt32Size(6, this.vigor);

        Iterator i$;
        Map.Entry _e_;
        for(i$ = this.propertysysmap.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(7, (Message)_e_.getValue())) {
            _e_ = (Map.Entry)i$.next();
            _size_ += CodedOutputStream.computeInt32Size(7, (Integer)_e_.getKey());
        }

        _size_ += CodedOutputStream.computeInt32Size(8, this.activitybpsys);
        _size_ += CodedOutputStream.computeInt32Size(9, this.todaypropsysswitchcount);
        _size_ += CodedOutputStream.computeInt64Size(10, this.timestamp);
        _size_ += CodedOutputStream.computeMessageSize(11, this.location);
        _size_ += CodedOutputStream.computeInt64Size(12, this.gold);
        _size_ += CodedOutputStream.computeInt64Size(13, this.silver);
        _size_ += CodedOutputStream.computeInt64Size(14, this.goldingot);
        _size_ += CodedOutputStream.computeInt32Size(15, this.dyecolorid);
        _size_ += CodedOutputStream.computeInt32Size(16, this.baoshidu);
        _size_ += CodedOutputStream.computeInt64Size(17, this.lastlogintime);
        _size_ += CodedOutputStream.computeInt64Size(18, this.lastlogofftime);
        _size_ += CodedOutputStream.computeInt64Size(19, this.keeponlinetime);
        _size_ += CodedOutputStream.computeInt32Size(20, this.fightvalue);
        _size_ += CodedOutputStream.computeInt64Size(21, this.leveluptime);
        _size_ += CodedOutputStream.computeInt64Size(22, this.accumulateleveluptime);
        _size_ += CodedOutputStream.computeInt64Size(23, this.vigorrefreshtime);
        _size_ += CodedOutputStream.computeInt32Size(24, this.convertxiulianexp);

        Long _v_;
        for(i$ = this.compensates.iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeInt64Size(25, _v_)) {
            _v_ = (Long)i$.next();
        }

        for(i$ = this.gather_map_item_infos.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(26, (Message)_e_.getValue())) {
            _e_ = (Map.Entry)i$.next();
            _size_ += CodedOutputStream.computeInt32Size(26, (Integer)_e_.getKey());
        }

        _size_ += CodedOutputStream.computeInt64Size(27, this.lastcalcuatetime);
        _size_ += CodedOutputStream.computeInt32Size(28, this.dayonlineseconds);
        _size_ += CodedOutputStream.computeInt64Size(29, this.onlineseconds);
        _size_ += CodedOutputStream.computeInt32Size(30, this.send_recharge_times_tip_mail_no);
        _size_ += CodedOutputStream.computeInt64Size(31, this.levelupcurtime);

        for(i$ = this.transfer_occupation_property_sys_map.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(32, (Message)_e_.getValue())) {
            _e_ = (Map.Entry)i$.next();
            _size_ += CodedOutputStream.computeInt32Size(32, (Integer)_e_.getKey());
        }

        for(i$ = this.coins.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(33, (Message)_e_.getValue())) {
            _e_ = (Map.Entry)i$.next();
            _size_ += CodedOutputStream.computeInt32Size(33, (Integer)_e_.getKey());
        }

        return _size_;
    }

    public CodedOutputStream marshal(CodedOutputStream _output_) throws InvalidProtocolBufferException {
        this._xdb_verify_unsafe_();

        try {
            _output_.writeInt32(1, this.level);
            _output_.writeInt32(2, this.exp);
            _output_.writeInt32(3, this.hp);
            _output_.writeInt32(4, this.mp);
            _output_.writeInt32(5, this.anger);
            _output_.writeInt32(6, this.vigor);
            Iterator i$ = this.propertysysmap.entrySet().iterator();

            Map.Entry _e_;
            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _output_.writeInt32(7, (Integer)_e_.getKey());
                _output_.writeMessage(7, (Message)_e_.getValue());
            }

            _output_.writeInt32(8, this.activitybpsys);
            _output_.writeInt32(9, this.todaypropsysswitchcount);
            _output_.writeInt64(10, this.timestamp);
            _output_.writeMessage(11, this.location);
            _output_.writeInt64(12, this.gold);
            _output_.writeInt64(13, this.silver);
            _output_.writeInt64(14, this.goldingot);
            _output_.writeInt32(15, this.dyecolorid);
            _output_.writeInt32(16, this.baoshidu);
            _output_.writeInt64(17, this.lastlogintime);
            _output_.writeInt64(18, this.lastlogofftime);
            _output_.writeInt64(19, this.keeponlinetime);
            _output_.writeInt32(20, this.fightvalue);
            _output_.writeInt64(21, this.leveluptime);
            _output_.writeInt64(22, this.accumulateleveluptime);
            _output_.writeInt64(23, this.vigorrefreshtime);
            _output_.writeInt32(24, this.convertxiulianexp);
            i$ = this.compensates.iterator();

            while(i$.hasNext()) {
                Long _v_ = (Long)i$.next();
                _output_.writeInt64(25, _v_);
            }

            i$ = this.gather_map_item_infos.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _output_.writeInt32(26, (Integer)_e_.getKey());
                _output_.writeMessage(26, (Message)_e_.getValue());
            }

            _output_.writeInt64(27, this.lastcalcuatetime);
            _output_.writeInt32(28, this.dayonlineseconds);
            _output_.writeInt64(29, this.onlineseconds);
            _output_.writeInt32(30, this.send_recharge_times_tip_mail_no);
            _output_.writeInt64(31, this.levelupcurtime);
            i$ = this.transfer_occupation_property_sys_map.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _output_.writeInt32(32, (Integer)_e_.getKey());
                _output_.writeMessage(32, (Message)_e_.getValue());
            }

            i$ = this.coins.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _output_.writeInt32(33, (Integer)_e_.getKey());
                _output_.writeMessage(33, (Message)_e_.getValue());
            }

            return _output_;
        } catch (IOException var4) {
            throw (new InvalidProtocolBufferException(var4)).setUnfinishedMessage(this);
        }
    }

    public CodedInputStream unmarshal(CodedInputStream _input_) throws InvalidProtocolBufferException {
        this._xdb_verify_unsafe_();

        try {
            boolean done = false;

            while(!done) {
                int tag = _input_.readTag();
                boolean _k_;
                int readTag;
                int _k_;
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 8:
                        this.level = _input_.readInt32();
                        break;
                    case 16:
                        this.exp = _input_.readInt32();
                        break;
                    case 24:
                        this.hp = _input_.readInt32();
                        break;
                    case 32:
                        this.mp = _input_.readInt32();
                        break;
                    case 40:
                        this.anger = _input_.readInt32();
                        break;
                    case 48:
                        this.vigor = _input_.readInt32();
                        break;
                    case 56:
                        _k_ = false;
                        _k_ = _input_.readInt32();
                        readTag = _input_.readTag();
                        if (58 != readTag) {
                            throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                        }

                        BasicPropertiesSystem _v_ = new xbean.__.BasicPropertiesSystem(0, this, "propertysysmap");
                        _input_.readMessage(_v_);
                        this.propertysysmap.put(_k_, _v_);
                        break;
                    case 64:
                        this.activitybpsys = _input_.readInt32();
                        break;
                    case 72:
                        this.todaypropsysswitchcount = _input_.readInt32();
                        break;
                    case 80:
                        this.timestamp = _input_.readInt64();
                        break;
                    case 90:
                        _input_.readMessage(this.location);
                        break;
                    case 96:
                        this.gold = _input_.readInt64();
                        break;
                    case 104:
                        this.silver = _input_.readInt64();
                        break;
                    case 112:
                        this.goldingot = _input_.readInt64();
                        break;
                    case 120:
                        this.dyecolorid = _input_.readInt32();
                        break;
                    case 128:
                        this.baoshidu = _input_.readInt32();
                        break;
                    case 136:
                        this.lastlogintime = _input_.readInt64();
                        break;
                    case 144:
                        this.lastlogofftime = _input_.readInt64();
                        break;
                    case 152:
                        this.keeponlinetime = _input_.readInt64();
                        break;
                    case 160:
                        this.fightvalue = _input_.readInt32();
                        break;
                    case 168:
                        this.leveluptime = _input_.readInt64();
                        break;
                    case 176:
                        this.accumulateleveluptime = _input_.readInt64();
                        break;
                    case 184:
                        this.vigorrefreshtime = _input_.readInt64();
                        break;
                    case 192:
                        this.convertxiulianexp = _input_.readInt32();
                        break;
                    case 200:
                        long _v_ = 0L;
                        _v_ = _input_.readInt64();
                        this.compensates.add(_v_);
                        break;
                    case 208:
                        _k_ = false;
                        _k_ = _input_.readInt32();
                        readTag = _input_.readTag();
                        if (210 != readTag) {
                            throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                        }

                        GatherMapItemInfo _v_ = new xbean.__.GatherMapItemInfo(0, this, "gather_map_item_infos");
                        _input_.readMessage(_v_);
                        this.gather_map_item_infos.put(_k_, _v_);
                        break;
                    case 216:
                        this.lastcalcuatetime = _input_.readInt64();
                        break;
                    case 224:
                        this.dayonlineseconds = _input_.readInt32();
                        break;
                    case 232:
                        this.onlineseconds = _input_.readInt64();
                        break;
                    case 240:
                        this.send_recharge_times_tip_mail_no = _input_.readInt32();
                        break;
                    case 248:
                        this.levelupcurtime = _input_.readInt64();
                        break;
                    case 256:
                        _k_ = false;
                        _k_ = _input_.readInt32();
                        readTag = _input_.readTag();
                        if (258 != readTag) {
                            throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                        }

                        TransferOccupationPropertiesSys _v_ = new xbean.__.TransferOccupationPropertiesSys(0, this, "transfer_occupation_property_sys_map");
                        _input_.readMessage(_v_);
                        this.transfer_occupation_property_sys_map.put(_k_, _v_);
                        break;
                    case 264:
                        _k_ = false;
                        _k_ = _input_.readInt32();
                        readTag = _input_.readTag();
                        if (266 != readTag) {
                            throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                        }

                        CoinInfo _v_ = new xbean.__.CoinInfo(0, this, "coins");
                        _input_.readMessage(_v_);
                        this.coins.put(_k_, _v_);
                        break;
                    default:
                        if (!CodedInputStream.skipUnknownField(tag, _input_)) {
                            done = true;
                        }
                }
            }

            return _input_;
        } catch (InvalidProtocolBufferException var7) {
            throw var7.setUnfinishedMessage(this);
        } catch (IOException var8) {
            throw (new InvalidProtocolBufferException(var8)).setUnfinishedMessage(this);
        }
    }

    public xbean.Properties copy() {
        this._xdb_verify_unsafe_();
        return new Properties(this);
    }

    public xbean.Properties toData() {
        this._xdb_verify_unsafe_();
        return new Data(this);
    }

    public xbean.Properties toBean() {
        this._xdb_verify_unsafe_();
        return new Properties(this);
    }

    public xbean.Properties toDataIf() {
        this._xdb_verify_unsafe_();
        return new Data(this);
    }

    public xbean.Properties toBeanIf() {
        this._xdb_verify_unsafe_();
        return this;
    }

    public Bean toConst() {
        this._xdb_verify_unsafe_();
        return new Const();
    }

    public int getLevel() {
        this._xdb_verify_unsafe_();
        return this.level;
    }

    public int getExp() {
        this._xdb_verify_unsafe_();
        return this.exp;
    }

    public int getHp() {
        this._xdb_verify_unsafe_();
        return this.hp;
    }

    public int getMp() {
        this._xdb_verify_unsafe_();
        return this.mp;
    }

    public int getAnger() {
        this._xdb_verify_unsafe_();
        return this.anger;
    }

    public int getVigor() {
        this._xdb_verify_unsafe_();
        return this.vigor;
    }

    public Map<Integer, BasicPropertiesSystem> getPropertysysmap() {
        this._xdb_verify_unsafe_();
        return Logs.logMap(new LogKey(this, "propertysysmap"), this.propertysysmap);
    }

    public Map<Integer, BasicPropertiesSystem> getPropertysysmapAsData() {
        this._xdb_verify_unsafe_();
        Map<Integer, BasicPropertiesSystem> propertysysmap = new HashMap();
        Iterator i$ = this.propertysysmap.entrySet().iterator();

        while(i$.hasNext()) {
            Map.Entry<Integer, BasicPropertiesSystem> _e_ = (Map.Entry)i$.next();
            propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem.Data((BasicPropertiesSystem)_e_.getValue()));
        }

        return propertysysmap;
    }

    public int getActivitybpsys() {
        this._xdb_verify_unsafe_();
        return this.activitybpsys;
    }

    public int getTodaypropsysswitchcount() {
        this._xdb_verify_unsafe_();
        return this.todaypropsysswitchcount;
    }

    public long getTimestamp() {
        this._xdb_verify_unsafe_();
        return this.timestamp;
    }

    public Location getLocation() {
        this._xdb_verify_unsafe_();
        return this.location;
    }

    public long getGold() {
        this._xdb_verify_unsafe_();
        return this.gold;
    }

    public long getSilver() {
        this._xdb_verify_unsafe_();
        return this.silver;
    }

    public long getGoldingot() {
        this._xdb_verify_unsafe_();
        return this.goldingot;
    }

    public int getDyecolorid() {
        this._xdb_verify_unsafe_();
        return this.dyecolorid;
    }

    public int getBaoshidu() {
        this._xdb_verify_unsafe_();
        return this.baoshidu;
    }

    public long getLastlogintime() {
        this._xdb_verify_unsafe_();
        return this.lastlogintime;
    }

    public long getLastlogofftime() {
        this._xdb_verify_unsafe_();
        return this.lastlogofftime;
    }

    public long getKeeponlinetime() {
        this._xdb_verify_unsafe_();
        return this.keeponlinetime;
    }

    public int getFightvalue() {
        this._xdb_verify_unsafe_();
        return this.fightvalue;
    }

    public long getLeveluptime() {
        this._xdb_verify_unsafe_();
        return this.leveluptime;
    }

    public long getAccumulateleveluptime() {
        this._xdb_verify_unsafe_();
        return this.accumulateleveluptime;
    }

    public long getVigorrefreshtime() {
        this._xdb_verify_unsafe_();
        return this.vigorrefreshtime;
    }

    public int getConvertxiulianexp() {
        this._xdb_verify_unsafe_();
        return this.convertxiulianexp;
    }

    public Set<Long> getCompensates() {
        this._xdb_verify_unsafe_();
        return Logs.logSet(new LogKey(this, "compensates"), this.compensates);
    }

    public Set<Long> getCompensatesAsData() {
        this._xdb_verify_unsafe_();
        Set<Long> compensates = new SetX();
        compensates.addAll(this.compensates);
        return compensates;
    }

    public Map<Integer, GatherMapItemInfo> getGather_map_item_infos() {
        this._xdb_verify_unsafe_();
        return Logs.logMap(new LogKey(this, "gather_map_item_infos"), this.gather_map_item_infos);
    }

    public Map<Integer, GatherMapItemInfo> getGather_map_item_infosAsData() {
        this._xdb_verify_unsafe_();
        Map<Integer, GatherMapItemInfo> gather_map_item_infos = new HashMap();
        Iterator i$ = this.gather_map_item_infos.entrySet().iterator();

        while(i$.hasNext()) {
            Map.Entry<Integer, GatherMapItemInfo> _e_ = (Map.Entry)i$.next();
            gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo.Data((GatherMapItemInfo)_e_.getValue()));
        }

        return gather_map_item_infos;
    }

    public long getLastcalcuatetime() {
        this._xdb_verify_unsafe_();
        return this.lastcalcuatetime;
    }

    public int getDayonlineseconds() {
        this._xdb_verify_unsafe_();
        return this.dayonlineseconds;
    }

//* 第二段
    public long getOnlineseconds() {
        this._xdb_verify_unsafe_();
        return this.onlineseconds;
    }

    public int getSend_recharge_times_tip_mail_no() {
        this._xdb_verify_unsafe_();
        return this.send_recharge_times_tip_mail_no;
    }

    public long getLevelupcurtime() {
        this._xdb_verify_unsafe_();
        return this.levelupcurtime;
    }

    public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_map() {
        this._xdb_verify_unsafe_();
        return Logs.logMap(new LogKey(this, "transfer_occupation_property_sys_map"), this.transfer_occupation_property_sys_map);
    }

    public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_mapAsData() {
        this._xdb_verify_unsafe_();
        Map<Integer, TransferOccupationPropertiesSys> transfer_occupation_property_sys_map = new HashMap();
        Iterator i$ = this.transfer_occupation_property_sys_map.entrySet().iterator();

        while(i$.hasNext()) {
            Map.Entry<Integer, TransferOccupationPropertiesSys> _e_ = (Map.Entry)i$.next();
            transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys.Data((TransferOccupationPropertiesSys)_e_.getValue()));
        }

        return transfer_occupation_property_sys_map;
    }

    public Map<Integer, CoinInfo> getCoins() {
        this._xdb_verify_unsafe_();
        return Logs.logMap(new LogKey(this, "coins"), this.coins);
    }

    public Map<Integer, CoinInfo> getCoinsAsData() {
        this._xdb_verify_unsafe_();
        Map<Integer, CoinInfo> coins = new HashMap();
        Iterator i$ = this.coins.entrySet().iterator();

        while(i$.hasNext()) {
            Map.Entry<Integer, CoinInfo> _e_ = (Map.Entry)i$.next();
            coins.put(_e_.getKey(), new xbean.__.CoinInfo.Data((CoinInfo)_e_.getValue()));
        }

        return coins;
    }

    public void setLevel(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "level") {
            protected Log create() {
                return new LogInt(this, Properties.this.level) {
                    public void rollback() {
                        Properties.this.level = this._xdb_saved;
                    }
                };
            }
        });
        this.level = _v_;
    }

    public void setExp(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "exp") {
            protected Log create() {
                return new LogInt(this, Properties.this.exp) {
                    public void rollback() {
                        Properties.this.exp = this._xdb_saved;
                    }
                };
            }
        });
        this.exp = _v_;
    }

    public void setHp(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "hp") {
            protected Log create() {
                return new LogInt(this, Properties.this.hp) {
                    public void rollback() {
                        Properties.this.hp = this._xdb_saved;
                    }
                };
            }
        });
        this.hp = _v_;
    }

    public void setMp(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "mp") {
            protected Log create() {
                return new LogInt(this, Properties.this.mp) {
                    public void rollback() {
                        Properties.this.mp = this._xdb_saved;
                    }
                };
            }
        });
        this.mp = _v_;
    }

    public void setAnger(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "anger") {
            protected Log create() {
                return new LogInt(this, Properties.this.anger) {
                    public void rollback() {
                        Properties.this.anger = this._xdb_saved;
                    }
                };
            }
        });
        this.anger = _v_;
    }

    public void setVigor(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "vigor") {
            protected Log create() {
                return new LogInt(this, Properties.this.vigor) {
                    public void rollback() {
                        Properties.this.vigor = this._xdb_saved;
                    }
                };
            }
        });
        this.vigor = _v_;
    }

    public void setActivitybpsys(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "activitybpsys") {
            protected Log create() {
                return new LogInt(this, Properties.this.activitybpsys) {
                    public void rollback() {
                        Properties.this.activitybpsys = this._xdb_saved;
                    }
                };
            }
        });
        this.activitybpsys = _v_;
    }

    public void setTodaypropsysswitchcount(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "todaypropsysswitchcount") {
            protected Log create() {
                return new LogInt(this, Properties.this.todaypropsysswitchcount) {
                    public void rollback() {
                        Properties.this.todaypropsysswitchcount = this._xdb_saved;
                    }
                };
            }
        });
        this.todaypropsysswitchcount = _v_;
    }

    public void setTimestamp(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "timestamp") {
            protected Log create() {
                return new LogLong(this, Properties.this.timestamp) {
                    public void rollback() {
                        Properties.this.timestamp = this._xdb_saved;
                    }
                };
            }
        });
        this.timestamp = _v_;
    }

    public void setGold(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "gold") {
            protected Log create() {
                return new LogLong(this, Properties.this.gold) {
                    public void rollback() {
                        Properties.this.gold = this._xdb_saved;
                    }
                };
            }
        });
        this.gold = _v_;
    }

    public void setSilver(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "silver") {
            protected Log create() {
                return new LogLong(this, Properties.this.silver) {
                    public void rollback() {
                        Properties.this.silver = this._xdb_saved;
                    }
                };
            }
        });
        this.silver = _v_;
    }

    public void setGoldingot(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "goldingot") {
            protected Log create() {
                return new LogLong(this, Properties.this.goldingot) {
                    public void rollback() {
                        Properties.this.goldingot = this._xdb_saved;
                    }
                };
            }
        });
        this.goldingot = _v_;
    }

    public void setDyecolorid(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "dyecolorid") {
            protected Log create() {
                return new LogInt(this, Properties.this.dyecolorid) {
                    public void rollback() {
                        Properties.this.dyecolorid = this._xdb_saved;
                    }
                };
            }
        });
        this.dyecolorid = _v_;
    }

    public void setBaoshidu(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "baoshidu") {
            protected Log create() {
                return new LogInt(this, Properties.this.baoshidu) {
                    public void rollback() {
                        Properties.this.baoshidu = this._xdb_saved;
                    }
                };
            }
        });
        this.baoshidu = _v_;
    }

    public void setLastlogintime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "lastlogintime") {
            protected Log create() {
                return new LogLong(this, Properties.this.lastlogintime) {
                    public void rollback() {
                        Properties.this.lastlogintime = this._xdb_saved;
                    }
                };
            }
        });
        this.lastlogintime = _v_;
    }

    public void setLastlogofftime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "lastlogofftime") {
            protected Log create() {
                return new LogLong(this, Properties.this.lastlogofftime) {
                    public void rollback() {
                        Properties.this.lastlogofftime = this._xdb_saved;
                    }
                };
            }
        });
        this.lastlogofftime = _v_;
    }

    public void setKeeponlinetime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "keeponlinetime") {
            protected Log create() {
                return new LogLong(this, Properties.this.keeponlinetime) {
                    public void rollback() {
                        Properties.this.keeponlinetime = this._xdb_saved;
                    }
                };
            }
        });
        this.keeponlinetime = _v_;
    }

    public void setFightvalue(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "fightvalue") {
            protected Log create() {
                return new LogInt(this, Properties.this.fightvalue) {
                    public void rollback() {
                        Properties.this.fightvalue = this._xdb_saved;
                    }
                };
            }
        });
        this.fightvalue = _v_;
    }

    public void setLeveluptime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "leveluptime") {
            protected Log create() {
                return new LogLong(this, Properties.this.leveluptime) {
                    public void rollback() {
                        Properties.this.leveluptime = this._xdb_saved;
                    }
                };
            }
        });
        this.leveluptime = _v_;
    }

    public void setAccumulateleveluptime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "accumulateleveluptime") {
            protected Log create() {
                return new LogLong(this, Properties.this.accumulateleveluptime) {
                    public void rollback() {
                        Properties.this.accumulateleveluptime = this._xdb_saved;
                    }
                };
            }
        });
        this.accumulateleveluptime = _v_;
    }

    public void setVigorrefreshtime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "vigorrefreshtime") {
            protected Log create() {
                return new LogLong(this, Properties.this.vigorrefreshtime) {
                    public void rollback() {
                        Properties.this.vigorrefreshtime = this._xdb_saved;
                    }
                };
            }
        });
        this.vigorrefreshtime = _v_;
    }

    public void setConvertxiulianexp(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "convertxiulianexp") {
            protected Log create() {
                return new LogInt(this, Properties.this.convertxiulianexp) {
                    public void rollback() {
                        Properties.this.convertxiulianexp = this._xdb_saved;
                    }
                };
            }
        });
        this.convertxiulianexp = _v_;
    }

    public void setLastcalcuatetime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "lastcalcuatetime") {
            protected Log create() {
                return new LogLong(this, Properties.this.lastcalcuatetime) {
                    public void rollback() {
                        Properties.this.lastcalcuatetime = this._xdb_saved;
                    }
                };
            }
        });
        this.lastcalcuatetime = _v_;
    }

    public void setDayonlineseconds(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "dayonlineseconds") {
            protected Log create() {
                return new LogInt(this, Properties.this.dayonlineseconds) {
                    public void rollback() {
                        Properties.this.dayonlineseconds = this._xdb_saved;
                    }
                };
            }
        });
        this.dayonlineseconds = _v_;
    }

    public void setOnlineseconds(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "onlineseconds") {
            protected Log create() {
                return new LogLong(this, Properties.this.onlineseconds) {
                    public void rollback() {
                        Properties.this.onlineseconds = this._xdb_saved;
                    }
                };
            }
        });
        this.onlineseconds = _v_;
    }

    public void setSend_recharge_times_tip_mail_no(int _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "send_recharge_times_tip_mail_no") {
            protected Log create() {
                return new LogInt(this, Properties.this.send_recharge_times_tip_mail_no) {
                    public void rollback() {
                        Properties.this.send_recharge_times_tip_mail_no = this._xdb_saved;
                    }
                };
            }
        });
        this.send_recharge_times_tip_mail_no = _v_;
    }

    public void setLevelupcurtime(long _v_) {
        this._xdb_verify_unsafe_();
        Logs.logIf(new LogKey(this, "levelupcurtime") {
            protected Log create() {
                return new LogLong(this, Properties.this.levelupcurtime) {
                    public void rollback() {
                        Properties.this.levelupcurtime = this._xdb_saved;
                    }
                };
            }
        });
        this.levelupcurtime = _v_;
    }

    public final boolean equals(Object _o1_) {
        this._xdb_verify_unsafe_();
        Properties _o_ = null;
        if (_o1_ instanceof Properties) {
            _o_ = (Properties)_o1_;
        } else {
            if (!(_o1_ instanceof Const)) {
                return false;
            }

            _o_ = ((Const)_o1_).nThis();
        }

        if (this.level != _o_.level) {
            return false;
        } else if (this.exp != _o_.exp) {
            return false;
        } else if (this.hp != _o_.hp) {
            return false;
        } else if (this.mp != _o_.mp) {
            return false;
        } else if (this.anger != _o_.anger) {
            return false;
        } else if (this.vigor != _o_.vigor) {
            return false;
        } else if (!this.propertysysmap.equals(_o_.propertysysmap)) {
            return false;
        } else if (this.activitybpsys != _o_.activitybpsys) {
            return false;
        } else if (this.todaypropsysswitchcount != _o_.todaypropsysswitchcount) {
            return false;
        } else if (this.timestamp != _o_.timestamp) {
            return false;
        } else if (!this.location.equals(_o_.location)) {
            return false;
        } else if (this.gold != _o_.gold) {
            return false;
        } else if (this.silver != _o_.silver) {
            return false;
        } else if (this.goldingot != _o_.goldingot) {
            return false;
        } else if (this.dyecolorid != _o_.dyecolorid) {
            return false;
        } else if (this.baoshidu != _o_.baoshidu) {
            return false;
        } else if (this.lastlogintime != _o_.lastlogintime) {
            return false;
        } else if (this.lastlogofftime != _o_.lastlogofftime) {
            return false;
        } else if (this.keeponlinetime != _o_.keeponlinetime) {
            return false;
        } else if (this.fightvalue != _o_.fightvalue) {
            return false;
        } else if (this.leveluptime != _o_.leveluptime) {
            return false;
        } else if (this.accumulateleveluptime != _o_.accumulateleveluptime) {
            return false;
        } else if (this.vigorrefreshtime != _o_.vigorrefreshtime) {
            return false;
        } else if (this.convertxiulianexp != _o_.convertxiulianexp) {
            return false;
        } else if (!this.compensates.equals(_o_.compensates)) {
            return false;
        } else if (!this.gather_map_item_infos.equals(_o_.gather_map_item_infos)) {
            return false;
        } else if (this.lastcalcuatetime != _o_.lastcalcuatetime) {
            return false;
        } else if (this.dayonlineseconds != _o_.dayonlineseconds) {
            return false;
        } else if (this.onlineseconds != _o_.onlineseconds) {
            return false;
        } else if (this.send_recharge_times_tip_mail_no != _o_.send_recharge_times_tip_mail_no) {
            return false;
        } else if (this.levelupcurtime != _o_.levelupcurtime) {
            return false;
        } else if (!this.transfer_occupation_property_sys_map.equals(_o_.transfer_occupation_property_sys_map)) {
            return false;
        } else {
            return this.coins.equals(_o_.coins);
        }
    }

    public final int hashCode() {
        this._xdb_verify_unsafe_();
        int _h_ = 0;
        _h_ += this.level;
        _h_ += this.exp;
        _h_ += this.hp;
        _h_ += this.mp;
        _h_ += this.anger;
        _h_ += this.vigor;
        _h_ += this.propertysysmap.hashCode();
        _h_ += this.activitybpsys;
        _h_ += this.todaypropsysswitchcount;
        _h_ = (int)((long)_h_ + this.timestamp);
        _h_ += this.location.hashCode();
        _h_ = (int)((long)_h_ + this.gold);
        _h_ = (int)((long)_h_ + this.silver);
        _h_ = (int)((long)_h_ + this.goldingot);
        _h_ += this.dyecolorid;
        _h_ += this.baoshidu;
        _h_ = (int)((long)_h_ + this.lastlogintime);
        _h_ = (int)((long)_h_ + this.lastlogofftime);
        _h_ = (int)((long)_h_ + this.keeponlinetime);
        _h_ += this.fightvalue;
        _h_ = (int)((long)_h_ + this.leveluptime);
        _h_ = (int)((long)_h_ + this.accumulateleveluptime);
        _h_ = (int)((long)_h_ + this.vigorrefreshtime);
        _h_ += this.convertxiulianexp;
        _h_ += this.compensates.hashCode();
        _h_ += this.gather_map_item_infos.hashCode();
        _h_ = (int)((long)_h_ + this.lastcalcuatetime);
        _h_ += this.dayonlineseconds;
        _h_ = (int)((long)_h_ + this.onlineseconds);
        _h_ += this.send_recharge_times_tip_mail_no;
        _h_ = (int)((long)_h_ + this.levelupcurtime);
        _h_ += this.transfer_occupation_property_sys_map.hashCode();
        _h_ += this.coins.hashCode();
        return _h_;
    }

    public String toString() {
        this._xdb_verify_unsafe_();
        StringBuilder _sb_ = new StringBuilder();
        _sb_.append("(");
        _sb_.append(this.level);
        _sb_.append(",");
        _sb_.append(this.exp);
        _sb_.append(",");
        _sb_.append(this.hp);
        _sb_.append(",");
        _sb_.append(this.mp);
        _sb_.append(",");
        _sb_.append(this.anger);
        _sb_.append(",");
        _sb_.append(this.vigor);
        _sb_.append(",");
        _sb_.append(this.propertysysmap);
        _sb_.append(",");
        _sb_.append(this.activitybpsys);
        _sb_.append(",");
        _sb_.append(this.todaypropsysswitchcount);
        _sb_.append(",");
        _sb_.append(this.timestamp);
        _sb_.append(",");
        _sb_.append(this.location);
        _sb_.append(",");
        _sb_.append(this.gold);
        _sb_.append(",");
        _sb_.append(this.silver);
        _sb_.append(",");
        _sb_.append(this.goldingot);
        _sb_.append(",");
        _sb_.append(this.dyecolorid);
        _sb_.append(",");
        _sb_.append(this.baoshidu);
        _sb_.append(",");
        _sb_.append(this.lastlogintime);
        _sb_.append(",");
        _sb_.append(this.lastlogofftime);
        _sb_.append(",");
        _sb_.append(this.keeponlinetime);
        _sb_.append(",");
        _sb_.append(this.fightvalue);
        _sb_.append(",");
        _sb_.append(this.leveluptime);
        _sb_.append(",");
        _sb_.append(this.accumulateleveluptime);
        _sb_.append(",");
        _sb_.append(this.vigorrefreshtime);
        _sb_.append(",");
        _sb_.append(this.convertxiulianexp);
        _sb_.append(",");
        _sb_.append(this.compensates);
        _sb_.append(",");
        _sb_.append(this.gather_map_item_infos);
        _sb_.append(",");
        _sb_.append(this.lastcalcuatetime);
        _sb_.append(",");
        _sb_.append(this.dayonlineseconds);
        _sb_.append(",");
        _sb_.append(this.onlineseconds);
        _sb_.append(",");
        _sb_.append(this.send_recharge_times_tip_mail_no);
        _sb_.append(",");
        _sb_.append(this.levelupcurtime);
        _sb_.append(",");
        _sb_.append(this.transfer_occupation_property_sys_map);
        _sb_.append(",");
        _sb_.append(this.coins);
        _sb_.append(")");
        return _sb_.toString();
    }

    public Listenable newListenable() {
        ListenableBean lb = new ListenableBean();
        lb.add((new ListenableChanged()).setVarName("level"));
        lb.add((new ListenableChanged()).setVarName("exp"));
        lb.add((new ListenableChanged()).setVarName("hp"));
        lb.add((new ListenableChanged()).setVarName("mp"));
        lb.add((new ListenableChanged()).setVarName("anger"));
        lb.add((new ListenableChanged()).setVarName("vigor"));
        lb.add((new ListenableMap()).setVarName("propertysysmap"));
        lb.add((new ListenableChanged()).setVarName("activitybpsys"));
        lb.add((new ListenableChanged()).setVarName("todaypropsysswitchcount"));
        lb.add((new ListenableChanged()).setVarName("timestamp"));
        lb.add((new ListenableChanged()).setVarName("location"));
        lb.add((new ListenableChanged()).setVarName("gold"));
        lb.add((new ListenableChanged()).setVarName("silver"));
        lb.add((new ListenableChanged()).setVarName("goldingot"));
        lb.add((new ListenableChanged()).setVarName("dyecolorid"));
        lb.add((new ListenableChanged()).setVarName("baoshidu"));
        lb.add((new ListenableChanged()).setVarName("lastlogintime"));
        lb.add((new ListenableChanged()).setVarName("lastlogofftime"));
        lb.add((new ListenableChanged()).setVarName("keeponlinetime"));
        lb.add((new ListenableChanged()).setVarName("fightvalue"));
        lb.add((new ListenableChanged()).setVarName("leveluptime"));
        lb.add((new ListenableChanged()).setVarName("accumulateleveluptime"));
        lb.add((new ListenableChanged()).setVarName("vigorrefreshtime"));
        lb.add((new ListenableChanged()).setVarName("convertxiulianexp"));
        lb.add((new ListenableSet()).setVarName("compensates"));
        lb.add((new ListenableMap()).setVarName("gather_map_item_infos"));
        lb.add((new ListenableChanged()).setVarName("lastcalcuatetime"));
        lb.add((new ListenableChanged()).setVarName("dayonlineseconds"));
        lb.add((new ListenableChanged()).setVarName("onlineseconds"));
        lb.add((new ListenableChanged()).setVarName("send_recharge_times_tip_mail_no"));
        lb.add((new ListenableChanged()).setVarName("levelupcurtime"));
        lb.add((new ListenableMap()).setVarName("transfer_occupation_property_sys_map"));
        lb.add((new ListenableMap()).setVarName("coins"));
        return lb;
    }

    public static final class Data implements xbean.Properties {
        private int level;
        private int exp;
        private int hp;
        private int mp;
        private int anger;
        private int vigor;
        private HashMap<Integer, BasicPropertiesSystem> propertysysmap;
        private int activitybpsys;
        private int todaypropsysswitchcount;
        private long timestamp;
        private Location location;
        private long gold;
        private long silver;
        private long goldingot;
        private int dyecolorid;
        private int baoshidu;
        private long lastlogintime;
        private long lastlogofftime;
        private long keeponlinetime;
        private int fightvalue;
        private long leveluptime;
        private long accumulateleveluptime;
        private long vigorrefreshtime;
        private int convertxiulianexp;
        private HashSet<Long> compensates;
        private HashMap<Integer, GatherMapItemInfo> gather_map_item_infos;
        private long lastcalcuatetime;
        private int dayonlineseconds;
        private long onlineseconds;
        private int send_recharge_times_tip_mail_no;
        private long levelupcurtime;
        private HashMap<Integer, TransferOccupationPropertiesSys> transfer_occupation_property_sys_map;
        private HashMap<Integer, CoinInfo> coins;

        public void _reset_unsafe_() {
            throw new UnsupportedOperationException();
        }

        public Data() {
            this.level = 0;
            this.exp = 0;
            this.hp = 0;
            this.mp = 0;
            this.anger = 0;
            this.vigor = 0;
            this.propertysysmap = new HashMap();
            this.location = new xbean.__.Location.Data();
            this.compensates = new HashSet();
            this.gather_map_item_infos = new HashMap();
            this.send_recharge_times_tip_mail_no = 0;
            this.transfer_occupation_property_sys_map = new HashMap();
            this.coins = new HashMap();
        }

        Data(xbean.Properties _o1_) {
            if (_o1_ instanceof Properties) {
                this.assign((Properties)_o1_);
            } else if (_o1_ instanceof Data) {
                this.assign((Data)_o1_);
            } else {
                if (!(_o1_ instanceof Const)) {
                    throw new UnsupportedOperationException();
                }

                this.assign(((Const)_o1_).nThis());
            }

        }

        private void assign(Properties _o_) {
            this.level = _o_.level;
            this.exp = _o_.exp;
            this.hp = _o_.hp;
            this.mp = _o_.mp;
            this.anger = _o_.anger;
            this.vigor = _o_.vigor;
            this.propertysysmap = new HashMap();
            Iterator i$ = _o_.propertysysmap.entrySet().iterator();

            Map.Entry _e_;
            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem.Data((BasicPropertiesSystem)_e_.getValue()));
            }

            this.activitybpsys = _o_.activitybpsys;
            this.todaypropsysswitchcount = _o_.todaypropsysswitchcount;
            this.timestamp = _o_.timestamp;
            this.location = new xbean.__.Location.Data(_o_.location);
            this.gold = _o_.gold;
            this.silver = _o_.silver;
            this.goldingot = _o_.goldingot;
            this.dyecolorid = _o_.dyecolorid;
            this.baoshidu = _o_.baoshidu;
            this.lastlogintime = _o_.lastlogintime;
            this.lastlogofftime = _o_.lastlogofftime;
            this.keeponlinetime = _o_.keeponlinetime;
            this.fightvalue = _o_.fightvalue;
            this.leveluptime = _o_.leveluptime;
            this.accumulateleveluptime = _o_.accumulateleveluptime;
            this.vigorrefreshtime = _o_.vigorrefreshtime;
            this.convertxiulianexp = _o_.convertxiulianexp;
            this.compensates = new HashSet();
            this.compensates.addAll(_o_.compensates);
            this.gather_map_item_infos = new HashMap();
            i$ = _o_.gather_map_item_infos.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo.Data((GatherMapItemInfo)_e_.getValue()));
            }

            this.lastcalcuatetime = _o_.lastcalcuatetime;
            this.dayonlineseconds = _o_.dayonlineseconds;
            this.onlineseconds = _o_.onlineseconds;
            this.send_recharge_times_tip_mail_no = _o_.send_recharge_times_tip_mail_no;
            this.levelupcurtime = _o_.levelupcurtime;
            this.transfer_occupation_property_sys_map = new HashMap();
            i$ = _o_.transfer_occupation_property_sys_map.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys.Data((TransferOccupationPropertiesSys)_e_.getValue()));
            }

            this.coins = new HashMap();
            i$ = _o_.coins.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.coins.put(_e_.getKey(), new xbean.__.CoinInfo.Data((CoinInfo)_e_.getValue()));
            }

        }

        private void assign(Data _o_) {
            this.level = _o_.level;
            this.exp = _o_.exp;
            this.hp = _o_.hp;
            this.mp = _o_.mp;
            this.anger = _o_.anger;
            this.vigor = _o_.vigor;
            this.propertysysmap = new HashMap();
            Iterator i$ = _o_.propertysysmap.entrySet().iterator();

            Map.Entry _e_;
            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem.Data((BasicPropertiesSystem)_e_.getValue()));
            }

            this.activitybpsys = _o_.activitybpsys;
            this.todaypropsysswitchcount = _o_.todaypropsysswitchcount;
            this.timestamp = _o_.timestamp;
            this.location = new xbean.__.Location.Data(_o_.location);
            this.gold = _o_.gold;
            this.silver = _o_.silver;
            this.goldingot = _o_.goldingot;
            this.dyecolorid = _o_.dyecolorid;
            this.baoshidu = _o_.baoshidu;
            this.lastlogintime = _o_.lastlogintime;
            this.lastlogofftime = _o_.lastlogofftime;
            this.keeponlinetime = _o_.keeponlinetime;
            this.fightvalue = _o_.fightvalue;
            this.leveluptime = _o_.leveluptime;
            this.accumulateleveluptime = _o_.accumulateleveluptime;
            this.vigorrefreshtime = _o_.vigorrefreshtime;
            this.convertxiulianexp = _o_.convertxiulianexp;
            this.compensates = new HashSet();
            this.compensates.addAll(_o_.compensates);
            this.gather_map_item_infos = new HashMap();
            i$ = _o_.gather_map_item_infos.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo.Data((GatherMapItemInfo)_e_.getValue()));
            }

            this.lastcalcuatetime = _o_.lastcalcuatetime;
            this.dayonlineseconds = _o_.dayonlineseconds;
            this.onlineseconds = _o_.onlineseconds;
            this.send_recharge_times_tip_mail_no = _o_.send_recharge_times_tip_mail_no;
            this.levelupcurtime = _o_.levelupcurtime;
            this.transfer_occupation_property_sys_map = new HashMap();
            i$ = _o_.transfer_occupation_property_sys_map.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys.Data((TransferOccupationPropertiesSys)_e_.getValue()));
            }

            this.coins = new HashMap();
            i$ = _o_.coins.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                this.coins.put(_e_.getKey(), new xbean.__.CoinInfo.Data((CoinInfo)_e_.getValue()));
            }

        }

        public final OctetsStream marshal(OctetsStream _os_) {
            _os_.marshal(this.level);
            _os_.marshal(this.exp);
            _os_.marshal(this.hp);
            _os_.marshal(this.mp);
            _os_.marshal(this.anger);
            _os_.marshal(this.vigor);
            _os_.compact_uint32(this.propertysysmap.size());
            Iterator i$ = this.propertysysmap.entrySet().iterator();

            Map.Entry _e_;
            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _os_.marshal((Integer)_e_.getKey());
                ((BasicPropertiesSystem)_e_.getValue()).marshal(_os_);
            }

            _os_.marshal(this.activitybpsys);
            _os_.marshal(this.todaypropsysswitchcount);
            _os_.marshal(this.timestamp);
            this.location.marshal(_os_);
            _os_.marshal(this.gold);
            _os_.marshal(this.silver);
            _os_.marshal(this.goldingot);
            _os_.marshal(this.dyecolorid);
            _os_.marshal(this.baoshidu);
            _os_.marshal(this.lastlogintime);
            _os_.marshal(this.lastlogofftime);
            _os_.marshal(this.keeponlinetime);
            _os_.marshal(this.fightvalue);
            _os_.marshal(this.leveluptime);
            _os_.marshal(this.accumulateleveluptime);
            _os_.marshal(this.vigorrefreshtime);
            _os_.marshal(this.convertxiulianexp);
            _os_.compact_uint32(this.compensates.size());
            i$ = this.compensates.iterator();

            while(i$.hasNext()) {
                Long _v_ = (Long)i$.next();
                _os_.marshal(_v_);
            }

            _os_.compact_uint32(this.gather_map_item_infos.size());
            i$ = this.gather_map_item_infos.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _os_.marshal((Integer)_e_.getKey());
                ((GatherMapItemInfo)_e_.getValue()).marshal(_os_);
            }

            _os_.marshal(this.lastcalcuatetime);
            _os_.marshal(this.dayonlineseconds);
            _os_.marshal(this.onlineseconds);
            _os_.marshal(this.send_recharge_times_tip_mail_no);
            _os_.marshal(this.levelupcurtime);
            _os_.compact_uint32(this.transfer_occupation_property_sys_map.size());
            i$ = this.transfer_occupation_property_sys_map.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _os_.marshal((Integer)_e_.getKey());
                ((TransferOccupationPropertiesSys)_e_.getValue()).marshal(_os_);
            }

            _os_.compact_uint32(this.coins.size());
            i$ = this.coins.entrySet().iterator();

            while(i$.hasNext()) {
                _e_ = (Map.Entry)i$.next();
                _os_.marshal((Integer)_e_.getKey());
                ((CoinInfo)_e_.getValue()).marshal(_os_);
            }

            return _os_;
        }

        public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
            this.level = _os_.unmarshal_int();
            this.exp = _os_.unmarshal_int();
            this.hp = _os_.unmarshal_int();
            this.mp = _os_.unmarshal_int();
            this.anger = _os_.unmarshal_int();
            this.vigor = _os_.unmarshal_int();
            int size = _os_.uncompact_uint32();
            if (size >= 12) {
                this.propertysysmap = new HashMap(size * 2);
            }

            boolean _k_;
            int _k_;
            while(size > 0) {
                _k_ = false;
                _k_ = _os_.unmarshal_int();
                BasicPropertiesSystem _v_ = Pod.newBasicPropertiesSystemData();
                _v_.unmarshal(_os_);
                this.propertysysmap.put(_k_, _v_);
                --size;
            }

            this.activitybpsys = _os_.unmarshal_int();
            this.todaypropsysswitchcount = _os_.unmarshal_int();
            this.timestamp = _os_.unmarshal_long();
            this.location.unmarshal(_os_);
            this.gold = _os_.unmarshal_long();
            this.silver = _os_.unmarshal_long();
            this.goldingot = _os_.unmarshal_long();
            this.dyecolorid = _os_.unmarshal_int();
            this.baoshidu = _os_.unmarshal_int();
            this.lastlogintime = _os_.unmarshal_long();
            this.lastlogofftime = _os_.unmarshal_long();
            this.keeponlinetime = _os_.unmarshal_long();
            this.fightvalue = _os_.unmarshal_int();
            this.leveluptime = _os_.unmarshal_long();
            this.accumulateleveluptime = _os_.unmarshal_long();
            this.vigorrefreshtime = _os_.unmarshal_long();
            this.convertxiulianexp = _os_.unmarshal_int();

            for(size = _os_.uncompact_uint32(); size > 0; --size) {
                long _v_ = 0L;
                _v_ = _os_.unmarshal_long();
                this.compensates.add(_v_);
            }

            size = _os_.uncompact_uint32();
            if (size >= 12) {
                this.gather_map_item_infos = new HashMap(size * 2);
            }

            while(size > 0) {
                _k_ = false;
                _k_ = _os_.unmarshal_int();
                GatherMapItemInfo _v_ = Pod.newGatherMapItemInfoData();
                _v_.unmarshal(_os_);
                this.gather_map_item_infos.put(_k_, _v_);
                --size;
            }

            this.lastcalcuatetime = _os_.unmarshal_long();
            this.dayonlineseconds = _os_.unmarshal_int();
            this.onlineseconds = _os_.unmarshal_long();
            this.send_recharge_times_tip_mail_no = _os_.unmarshal_int();
            this.levelupcurtime = _os_.unmarshal_long();
            size = _os_.uncompact_uint32();
            if (size >= 12) {
                this.transfer_occupation_property_sys_map = new HashMap(size * 2);
            }

            while(size > 0) {
                _k_ = false;
                _k_ = _os_.unmarshal_int();
                TransferOccupationPropertiesSys _v_ = Pod.newTransferOccupationPropertiesSysData();
                _v_.unmarshal(_os_);
                this.transfer_occupation_property_sys_map.put(_k_, _v_);
                --size;
            }

            size = _os_.uncompact_uint32();
            if (size >= 12) {
                this.coins = new HashMap(size * 2);
            }

            while(size > 0) {
                _k_ = false;
                _k_ = _os_.unmarshal_int();
                CoinInfo _v_ = Pod.newCoinInfoData();
                _v_.unmarshal(_os_);
                this.coins.put(_k_, _v_);
                --size;
            }

            return _os_;
        }

        public final int getSerializedSize() {
            int _size_ = 0;
            _size_ += CodedOutputStream.computeInt32Size(1, this.level);
            _size_ += CodedOutputStream.computeInt32Size(2, this.exp);
            _size_ += CodedOutputStream.computeInt32Size(3, this.hp);
            _size_ += CodedOutputStream.computeInt32Size(4, this.mp);
            _size_ += CodedOutputStream.computeInt32Size(5, this.anger);
            _size_ += CodedOutputStream.computeInt32Size(6, this.vigor);

            Iterator i$;
            Map.Entry _e_;
            for(i$ = this.propertysysmap.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(7, (Message)_e_.getValue())) {
                _e_ = (Map.Entry)i$.next();
                _size_ += CodedOutputStream.computeInt32Size(7, (Integer)_e_.getKey());
            }

            _size_ += CodedOutputStream.computeInt32Size(8, this.activitybpsys);
            _size_ += CodedOutputStream.computeInt32Size(9, this.todaypropsysswitchcount);
            _size_ += CodedOutputStream.computeInt64Size(10, this.timestamp);
            _size_ += CodedOutputStream.computeMessageSize(11, this.location);
            _size_ += CodedOutputStream.computeInt64Size(12, this.gold);
            _size_ += CodedOutputStream.computeInt64Size(13, this.silver);
            _size_ += CodedOutputStream.computeInt64Size(14, this.goldingot);
            _size_ += CodedOutputStream.computeInt32Size(15, this.dyecolorid);
            _size_ += CodedOutputStream.computeInt32Size(16, this.baoshidu);
            _size_ += CodedOutputStream.computeInt64Size(17, this.lastlogintime);
            _size_ += CodedOutputStream.computeInt64Size(18, this.lastlogofftime);
            _size_ += CodedOutputStream.computeInt64Size(19, this.keeponlinetime);
            _size_ += CodedOutputStream.computeInt32Size(20, this.fightvalue);
            _size_ += CodedOutputStream.computeInt64Size(21, this.leveluptime);
            _size_ += CodedOutputStream.computeInt64Size(22, this.accumulateleveluptime);
            _size_ += CodedOutputStream.computeInt64Size(23, this.vigorrefreshtime);
            _size_ += CodedOutputStream.computeInt32Size(24, this.convertxiulianexp);

            Long _v_;
            for(i$ = this.compensates.iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeInt64Size(25, _v_)) {
                _v_ = (Long)i$.next();
            }

            for(i$ = this.gather_map_item_infos.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(26, (Message)_e_.getValue())) {
                _e_ = (Map.Entry)i$.next();
                _size_ += CodedOutputStream.computeInt32Size(26, (Integer)_e_.getKey());
            }

            _size_ += CodedOutputStream.computeInt64Size(27, this.lastcalcuatetime);
            _size_ += CodedOutputStream.computeInt32Size(28, this.dayonlineseconds);
            _size_ += CodedOutputStream.computeInt64Size(29, this.onlineseconds);
            _size_ += CodedOutputStream.computeInt32Size(30, this.send_recharge_times_tip_mail_no);
            _size_ += CodedOutputStream.computeInt64Size(31, this.levelupcurtime);

            for(i$ = this.transfer_occupation_property_sys_map.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(32, (Message)_e_.getValue())) {
                _e_ = (Map.Entry)i$.next();
                _size_ += CodedOutputStream.computeInt32Size(32, (Integer)_e_.getKey());
            }

            for(i$ = this.coins.entrySet().iterator(); i$.hasNext(); _size_ += CodedOutputStream.computeMessageSize(33, (Message)_e_.getValue())) {
                _e_ = (Map.Entry)i$.next();
                _size_ += CodedOutputStream.computeInt32Size(33, (Integer)_e_.getKey());
            }

            return _size_;
        }

        public CodedOutputStream marshal(CodedOutputStream _output_) throws InvalidProtocolBufferException {
            try {
                _output_.writeInt32(1, this.level);
                _output_.writeInt32(2, this.exp);
                _output_.writeInt32(3, this.hp);
                _output_.writeInt32(4, this.mp);
                _output_.writeInt32(5, this.anger);
                _output_.writeInt32(6, this.vigor);
                Iterator i$ = this.propertysysmap.entrySet().iterator();

                Map.Entry _e_;
                while(i$.hasNext()) {
                    _e_ = (Map.Entry)i$.next();
                    _output_.writeInt32(7, (Integer)_e_.getKey());
                    _output_.writeMessage(7, (Message)_e_.getValue());
                }

                _output_.writeInt32(8, this.activitybpsys);
                _output_.writeInt32(9, this.todaypropsysswitchcount);
                _output_.writeInt64(10, this.timestamp);
                _output_.writeMessage(11, this.location);
                _output_.writeInt64(12, this.gold);
                _output_.writeInt64(13, this.silver);
                _output_.writeInt64(14, this.goldingot);
                _output_.writeInt32(15, this.dyecolorid);
                _output_.writeInt32(16, this.baoshidu);
                _output_.writeInt64(17, this.lastlogintime);
                _output_.writeInt64(18, this.lastlogofftime);
                _output_.writeInt64(19, this.keeponlinetime);
                _output_.writeInt32(20, this.fightvalue);
                _output_.writeInt64(21, this.leveluptime);
                _output_.writeInt64(22, this.accumulateleveluptime);
                _output_.writeInt64(23, this.vigorrefreshtime);
                _output_.writeInt32(24, this.convertxiulianexp);
                i$ = this.compensates.iterator();

                while(i$.hasNext()) {
                    Long _v_ = (Long)i$.next();
                    _output_.writeInt64(25, _v_);
                }

                i$ = this.gather_map_item_infos.entrySet().iterator();

                while(i$.hasNext()) {
                    _e_ = (Map.Entry)i$.next();
                    _output_.writeInt32(26, (Integer)_e_.getKey());
                    _output_.writeMessage(26, (Message)_e_.getValue());
                }

                _output_.writeInt64(27, this.lastcalcuatetime);
                _output_.writeInt32(28, this.dayonlineseconds);
                _output_.writeInt64(29, this.onlineseconds);
                _output_.writeInt32(30, this.send_recharge_times_tip_mail_no);
                _output_.writeInt64(31, this.levelupcurtime);
                i$ = this.transfer_occupation_property_sys_map.entrySet().iterator();

                while(i$.hasNext()) {
                    _e_ = (Map.Entry)i$.next();
                    _output_.writeInt32(32, (Integer)_e_.getKey());
                    _output_.writeMessage(32, (Message)_e_.getValue());
                }

                i$ = this.coins.entrySet().iterator();

                while(i$.hasNext()) {
                    _e_ = (Map.Entry)i$.next();
                    _output_.writeInt32(33, (Integer)_e_.getKey());
                    _output_.writeMessage(33, (Message)_e_.getValue());
                }

                return _output_;
            } catch (IOException var4) {
                throw (new InvalidProtocolBufferException(var4)).setUnfinishedMessage(this);
            }
        }

        public CodedInputStream unmarshal(CodedInputStream _input_) throws InvalidProtocolBufferException {
            try {
                boolean done = false;

                while(!done) {
                    int tag = _input_.readTag();
                    boolean _k_;
                    int readTag;
                    int _k_;
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.level = _input_.readInt32();
                            break;
                        case 16:
                            this.exp = _input_.readInt32();
                            break;
                        case 24:
                            this.hp = _input_.readInt32();
                            break;
                        case 32:
                            this.mp = _input_.readInt32();
                            break;
                        case 40:
                            this.anger = _input_.readInt32();
                            break;
                        case 48:
                            this.vigor = _input_.readInt32();
                            break;
                        case 56:
                            _k_ = false;
                            _k_ = _input_.readInt32();
                            readTag = _input_.readTag();
                            if (58 != readTag) {
                                throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                            }

                            BasicPropertiesSystem _v_ = Pod.newBasicPropertiesSystemData();
                            _input_.readMessage(_v_);
                            this.propertysysmap.put(_k_, _v_);
                            break;
                        case 64:
                            this.activitybpsys = _input_.readInt32();
                            break;
                        case 72:
                            this.todaypropsysswitchcount = _input_.readInt32();
                            break;
                        case 80:
                            this.timestamp = _input_.readInt64();
                            break;
                        case 90:
                            _input_.readMessage(this.location);
                            break;
                        case 96:
                            this.gold = _input_.readInt64();
                            break;
                        case 104:
                            this.silver = _input_.readInt64();
                            break;
                        case 112:
                            this.goldingot = _input_.readInt64();
                            break;
                        case 120:
                            this.dyecolorid = _input_.readInt32();
                            break;
                        case 128:
                            this.baoshidu = _input_.readInt32();
                            break;
                        case 136:
                            this.lastlogintime = _input_.readInt64();
                            break;
                        case 144:
                            this.lastlogofftime = _input_.readInt64();
                            break;
                        case 152:
                            this.keeponlinetime = _input_.readInt64();
                            break;
                        case 160:
                            this.fightvalue = _input_.readInt32();
                            break;
                        case 168:
                            this.leveluptime = _input_.readInt64();
                            break;
                        case 176:
                            this.accumulateleveluptime = _input_.readInt64();
                            break;
                        case 184:
                            this.vigorrefreshtime = _input_.readInt64();
                            break;
                        case 192:
                            this.convertxiulianexp = _input_.readInt32();
                            break;
                        case 200:
                            long _v_ = 0L;
                            _v_ = _input_.readInt64();
                            this.compensates.add(_v_);
                            break;
                        case 208:
                            _k_ = false;
                            _k_ = _input_.readInt32();
                            readTag = _input_.readTag();
                            if (210 != readTag) {
                                throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                            }

                            GatherMapItemInfo _v_ = Pod.newGatherMapItemInfoData();
                            _input_.readMessage(_v_);
                            this.gather_map_item_infos.put(_k_, _v_);
                            break;
                        case 216:
                            this.lastcalcuatetime = _input_.readInt64();
                            break;
                        case 224:
                            this.dayonlineseconds = _input_.readInt32();
                            break;
                        case 232:
                            this.onlineseconds = _input_.readInt64();
                            break;
                        case 240:
                            this.send_recharge_times_tip_mail_no = _input_.readInt32();
                            break;
                        case 248:
                            this.levelupcurtime = _input_.readInt64();
                            break;
                        case 256:
                            _k_ = false;
                            _k_ = _input_.readInt32();
                            readTag = _input_.readTag();
                            if (258 != readTag) {
                                throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                            }

                            TransferOccupationPropertiesSys _v_ = Pod.newTransferOccupationPropertiesSysData();
                            _input_.readMessage(_v_);
                            this.transfer_occupation_property_sys_map.put(_k_, _v_);
                            break;
                        case 264:
                            _k_ = false;
                            _k_ = _input_.readInt32();
                            readTag = _input_.readTag();
                            if (266 != readTag) {
                                throw new InvalidProtocolBufferException("Protocol message map-key-value tag did not match expected tag.");
                            }

                            CoinInfo _v_ = Pod.newCoinInfoData();
                            _input_.readMessage(_v_);
                            this.coins.put(_k_, _v_);
                            break;
                        default:
                            if (!CodedInputStream.skipUnknownField(tag, _input_)) {
                                done = true;
                            }
                    }
                }

                return _input_;
            } catch (InvalidProtocolBufferException var7) {
                throw var7.setUnfinishedMessage(this);
            } catch (IOException var8) {
                throw (new InvalidProtocolBufferException(var8)).setUnfinishedMessage(this);
            }
        }

        public xbean.Properties copy() {
            return new Data(this);
        }

        public xbean.Properties toData() {
            return new Data(this);
        }

        public xbean.Properties toBean() {
            return new Properties(this, (XBean)null, (String)null);
        }

        public xbean.Properties toDataIf() {
            return this;
        }

        public xbean.Properties toBeanIf() {
            return new Properties(this, (XBean)null, (String)null);
        }

        public boolean xdbManaged() {
            throw new UnsupportedOperationException();
        }

        public Bean xdbParent() {
            throw new UnsupportedOperationException();
        }

        public String xdbVarname() {
            throw new UnsupportedOperationException();
        }

        public Long xdbObjId() {
            throw new UnsupportedOperationException();
        }

        public Bean toConst() {
            throw new UnsupportedOperationException();
        }

        public boolean isConst() {
            return false;
        }

        public boolean isData() {
            return true;
        }

        public int getLevel() {
            return this.level;
        }

        public int getExp() {
            return this.exp;
        }

        public int getHp() {
            return this.hp;
        }

        public int getMp() {
            return this.mp;
        }

        public int getAnger() {
            return this.anger;
        }

        public int getVigor() {
            return this.vigor;
        }

        public Map<Integer, BasicPropertiesSystem> getPropertysysmap() {
            return this.propertysysmap;
        }

        public Map<Integer, BasicPropertiesSystem> getPropertysysmapAsData() {
            return this.propertysysmap;
        }

        public int getActivitybpsys() {
            return this.activitybpsys;
        }

        public int getTodaypropsysswitchcount() {
            return this.todaypropsysswitchcount;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public Location getLocation() {
            return this.location;
        }

        public long getGold() {
            return this.gold;
        }

        public long getSilver() {
            return this.silver;
        }

        public long getGoldingot() {
            return this.goldingot;
        }

        public int getDyecolorid() {
            return this.dyecolorid;
        }

        public int getBaoshidu() {
            return this.baoshidu;
        }

        public long getLastlogintime() {
            return this.lastlogintime;
        }

        public long getLastlogofftime() {
            return this.lastlogofftime;
        }

        public long getKeeponlinetime() {
            return this.keeponlinetime;
        }

        public int getFightvalue() {
            return this.fightvalue;
        }

        public long getLeveluptime() {
            return this.leveluptime;
        }

        public long getAccumulateleveluptime() {
            return this.accumulateleveluptime;
        }

        public long getVigorrefreshtime() {
            return this.vigorrefreshtime;
        }

        public int getConvertxiulianexp() {
            return this.convertxiulianexp;
        }

        public Set<Long> getCompensates() {
            return this.compensates;
        }

        public Set<Long> getCompensatesAsData() {
            return this.compensates;
        }

        public Map<Integer, GatherMapItemInfo> getGather_map_item_infos() {
            return this.gather_map_item_infos;
        }

        public Map<Integer, GatherMapItemInfo> getGather_map_item_infosAsData() {
            return this.gather_map_item_infos;
        }

        public long getLastcalcuatetime() {
            return this.lastcalcuatetime;
        }

        public int getDayonlineseconds() {
            return this.dayonlineseconds;
        }

        public long getOnlineseconds() {
            return this.onlineseconds;
        }

        public int getSend_recharge_times_tip_mail_no() {
            return this.send_recharge_times_tip_mail_no;
        }

        public long getLevelupcurtime() {
            return this.levelupcurtime;
        }

        public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_map() {
            return this.transfer_occupation_property_sys_map;
        }

        public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_mapAsData() {
            return this.transfer_occupation_property_sys_map;
        }

        public Map<Integer, CoinInfo> getCoins() {
            return this.coins;
        }

        public Map<Integer, CoinInfo> getCoinsAsData() {
            return this.coins;
        }

        public void setLevel(int _v_) {
            this.level = _v_;
        }

        public void setExp(int _v_) {
            this.exp = _v_;
        }

        public void setHp(int _v_) {
            this.hp = _v_;
        }

        public void setMp(int _v_) {
            this.mp = _v_;
        }

        public void setAnger(int _v_) {
            this.anger = _v_;
        }

        public void setVigor(int _v_) {
            this.vigor = _v_;
        }

        public void setActivitybpsys(int _v_) {
            this.activitybpsys = _v_;
        }

        public void setTodaypropsysswitchcount(int _v_) {
            this.todaypropsysswitchcount = _v_;
        }

        public void setTimestamp(long _v_) {
            this.timestamp = _v_;
        }

        public void setGold(long _v_) {
            this.gold = _v_;
        }

        public void setSilver(long _v_) {
            this.silver = _v_;
        }

        public void setGoldingot(long _v_) {
            this.goldingot = _v_;
        }

        public void setDyecolorid(int _v_) {
            this.dyecolorid = _v_;
        }

        public void setBaoshidu(int _v_) {
            this.baoshidu = _v_;
        }

        public void setLastlogintime(long _v_) {
            this.lastlogintime = _v_;
        }

        public void setLastlogofftime(long _v_) {
            this.lastlogofftime = _v_;
        }

        public void setKeeponlinetime(long _v_) {
            this.keeponlinetime = _v_;
        }

        public void setFightvalue(int _v_) {
            this.fightvalue = _v_;
        }

        public void setLeveluptime(long _v_) {
            this.leveluptime = _v_;
        }

        public void setAccumulateleveluptime(long _v_) {
            this.accumulateleveluptime = _v_;
        }

        public void setVigorrefreshtime(long _v_) {
            this.vigorrefreshtime = _v_;
        }

        public void setConvertxiulianexp(int _v_) {
            this.convertxiulianexp = _v_;
        }

        public void setLastcalcuatetime(long _v_) {
            this.lastcalcuatetime = _v_;
        }

        public void setDayonlineseconds(int _v_) {
            this.dayonlineseconds = _v_;
        }

        public void setOnlineseconds(long _v_) {
            this.onlineseconds = _v_;
        }

        public void setSend_recharge_times_tip_mail_no(int _v_) {
            this.send_recharge_times_tip_mail_no = _v_;
        }

        public void setLevelupcurtime(long _v_) {
            this.levelupcurtime = _v_;
        }

        public final boolean equals(Object _o1_) {
            if (!(_o1_ instanceof Data)) {
                return false;
            } else {
                Data _o_ = (Data)_o1_;
                if (this.level != _o_.level) {
                    return false;
                } else if (this.exp != _o_.exp) {
                    return false;
                } else if (this.hp != _o_.hp) {
                    return false;
                } else if (this.mp != _o_.mp) {
                    return false;
                } else if (this.anger != _o_.anger) {
                    return false;
                } else if (this.vigor != _o_.vigor) {
                    return false;
                } else if (!this.propertysysmap.equals(_o_.propertysysmap)) {
                    return false;
                } else if (this.activitybpsys != _o_.activitybpsys) {
                    return false;
                } else if (this.todaypropsysswitchcount != _o_.todaypropsysswitchcount) {
                    return false;
                } else if (this.timestamp != _o_.timestamp) {
                    return false;
                } else if (!this.location.equals(_o_.location)) {
                    return false;
                } else if (this.gold != _o_.gold) {
                    return false;
                } else if (this.silver != _o_.silver) {
                    return false;
                } else if (this.goldingot != _o_.goldingot) {
                    return false;
                } else if (this.dyecolorid != _o_.dyecolorid) {
                    return false;
                } else if (this.baoshidu != _o_.baoshidu) {
                    return false;
                } else if (this.lastlogintime != _o_.lastlogintime) {
                    return false;
                } else if (this.lastlogofftime != _o_.lastlogofftime) {
                    return false;
                } else if (this.keeponlinetime != _o_.keeponlinetime) {
                    return false;
                } else if (this.fightvalue != _o_.fightvalue) {
                    return false;
                } else if (this.leveluptime != _o_.leveluptime) {
                    return false;
                } else if (this.accumulateleveluptime != _o_.accumulateleveluptime) {
                    return false;
                } else if (this.vigorrefreshtime != _o_.vigorrefreshtime) {
                    return false;
                } else if (this.convertxiulianexp != _o_.convertxiulianexp) {
                    return false;
                } else if (!this.compensates.equals(_o_.compensates)) {
                    return false;
                } else if (!this.gather_map_item_infos.equals(_o_.gather_map_item_infos)) {
                    return false;
                } else if (this.lastcalcuatetime != _o_.lastcalcuatetime) {
                    return false;
                } else if (this.dayonlineseconds != _o_.dayonlineseconds) {
                    return false;
                } else if (this.onlineseconds != _o_.onlineseconds) {
                    return false;
                } else if (this.send_recharge_times_tip_mail_no != _o_.send_recharge_times_tip_mail_no) {
                    return false;
                } else if (this.levelupcurtime != _o_.levelupcurtime) {
                    return false;
                } else if (!this.transfer_occupation_property_sys_map.equals(_o_.transfer_occupation_property_sys_map)) {
                    return false;
                } else {
                    return this.coins.equals(_o_.coins);
                }
            }
        }

        public final int hashCode() {
            int _h_ = 0;
            _h_ += this.level;
            _h_ += this.exp;
            _h_ += this.hp;
            _h_ += this.mp;
            _h_ += this.anger;
            _h_ += this.vigor;
            _h_ += this.propertysysmap.hashCode();
            _h_ += this.activitybpsys;
            _h_ += this.todaypropsysswitchcount;
            _h_ = (int)((long)_h_ + this.timestamp);
            _h_ += this.location.hashCode();
            _h_ = (int)((long)_h_ + this.gold);
            _h_ = (int)((long)_h_ + this.silver);
            _h_ = (int)((long)_h_ + this.goldingot);
            _h_ += this.dyecolorid;
            _h_ += this.baoshidu;
            _h_ = (int)((long)_h_ + this.lastlogintime);
            _h_ = (int)((long)_h_ + this.lastlogofftime);
            _h_ = (int)((long)_h_ + this.keeponlinetime);
            _h_ += this.fightvalue;
            _h_ = (int)((long)_h_ + this.leveluptime);
            _h_ = (int)((long)_h_ + this.accumulateleveluptime);
            _h_ = (int)((long)_h_ + this.vigorrefreshtime);
            _h_ += this.convertxiulianexp;
            _h_ += this.compensates.hashCode();
            _h_ += this.gather_map_item_infos.hashCode();
            _h_ = (int)((long)_h_ + this.lastcalcuatetime);
            _h_ += this.dayonlineseconds;
            _h_ = (int)((long)_h_ + this.onlineseconds);
            _h_ += this.send_recharge_times_tip_mail_no;
            _h_ = (int)((long)_h_ + this.levelupcurtime);
            _h_ += this.transfer_occupation_property_sys_map.hashCode();
            _h_ += this.coins.hashCode();
            return _h_;
        }

        public String toString() {
            StringBuilder _sb_ = new StringBuilder();
            _sb_.append("(");
            _sb_.append(this.level);
            _sb_.append(",");
            _sb_.append(this.exp);
            _sb_.append(",");
            _sb_.append(this.hp);
            _sb_.append(",");
            _sb_.append(this.mp);
            _sb_.append(",");
            _sb_.append(this.anger);
            _sb_.append(",");
            _sb_.append(this.vigor);
            _sb_.append(",");
            _sb_.append(this.propertysysmap);
            _sb_.append(",");
            _sb_.append(this.activitybpsys);
            _sb_.append(",");
            _sb_.append(this.todaypropsysswitchcount);
            _sb_.append(",");
            _sb_.append(this.timestamp);
            _sb_.append(",");
            _sb_.append(this.location);
            _sb_.append(",");
            _sb_.append(this.gold);
            _sb_.append(",");
            _sb_.append(this.silver);
            _sb_.append(",");
            _sb_.append(this.goldingot);
            _sb_.append(",");
            _sb_.append(this.dyecolorid);
            _sb_.append(",");
            _sb_.append(this.baoshidu);
            _sb_.append(",");
            _sb_.append(this.lastlogintime);
            _sb_.append(",");
            _sb_.append(this.lastlogofftime);
            _sb_.append(",");
            _sb_.append(this.keeponlinetime);
            _sb_.append(",");
            _sb_.append(this.fightvalue);
            _sb_.append(",");
            _sb_.append(this.leveluptime);
            _sb_.append(",");
            _sb_.append(this.accumulateleveluptime);
            _sb_.append(",");
            _sb_.append(this.vigorrefreshtime);
            _sb_.append(",");
            _sb_.append(this.convertxiulianexp);
            _sb_.append(",");
            _sb_.append(this.compensates);
            _sb_.append(",");
            _sb_.append(this.gather_map_item_infos);
            _sb_.append(",");
            _sb_.append(this.lastcalcuatetime);
            _sb_.append(",");
            _sb_.append(this.dayonlineseconds);
            _sb_.append(",");
            _sb_.append(this.onlineseconds);
            _sb_.append(",");
            _sb_.append(this.send_recharge_times_tip_mail_no);
            _sb_.append(",");
            _sb_.append(this.levelupcurtime);
            _sb_.append(",");
            _sb_.append(this.transfer_occupation_property_sys_map);
            _sb_.append(",");
            _sb_.append(this.coins);
            _sb_.append(")");
            return _sb_.toString();
        }
    }

    private class Const implements xbean.Properties {
        private Const() {
        }

        Properties nThis() {
            return Properties.this;
        }

        public void _reset_unsafe_() {
            throw new UnsupportedOperationException();
        }

        public xbean.Properties copy() {
            return Properties.this.copy();
        }

        public xbean.Properties toData() {
            return Properties.this.toData();
        }

        public xbean.Properties toBean() {
            return Properties.this.toBean();
        }

        public xbean.Properties toDataIf() {
            return Properties.this.toDataIf();
        }

        public xbean.Properties toBeanIf() {
            return Properties.this.toBeanIf();
        }

        public int getLevel() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.level;
        }

        public int getExp() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.exp;
        }

        public int getHp() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.hp;
        }

        public int getMp() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.mp;
        }

        public int getAnger() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.anger;
        }

        public int getVigor() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.vigor;
        }

        public Map<Integer, BasicPropertiesSystem> getPropertysysmap() {
            Properties.this._xdb_verify_unsafe_();
            return Consts.constMap(Properties.this.propertysysmap);
        }

        public Map<Integer, BasicPropertiesSystem> getPropertysysmapAsData() {
            Properties.this._xdb_verify_unsafe_();
            Properties _o_ = Properties.this;
            Map<Integer, BasicPropertiesSystem> propertysysmap = new HashMap();
            Iterator i$ = _o_.propertysysmap.entrySet().iterator();

            while(i$.hasNext()) {
                Map.Entry<Integer, BasicPropertiesSystem> _e_ = (Map.Entry)i$.next();
                propertysysmap.put(_e_.getKey(), new xbean.__.BasicPropertiesSystem.Data((BasicPropertiesSystem)_e_.getValue()));
            }

            return propertysysmap;
        }

        public int getActivitybpsys() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.activitybpsys;
        }

        public int getTodaypropsysswitchcount() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.todaypropsysswitchcount;
        }

        public long getTimestamp() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.timestamp;
        }

        public Location getLocation() {
            Properties.this._xdb_verify_unsafe_();
            return (Location)Consts.toConst(Properties.this.location);
        }

        public long getGold() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.gold;
        }

        public long getSilver() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.silver;
        }

        public long getGoldingot() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.goldingot;
        }

        public int getDyecolorid() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.dyecolorid;
        }

        public int getBaoshidu() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.baoshidu;
        }

        public long getLastlogintime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.lastlogintime;
        }

        public long getLastlogofftime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.lastlogofftime;
        }

        public long getKeeponlinetime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.keeponlinetime;
        }

        public int getFightvalue() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.fightvalue;
        }

        public long getLeveluptime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.leveluptime;
        }

        public long getAccumulateleveluptime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.accumulateleveluptime;
        }

        public long getVigorrefreshtime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.vigorrefreshtime;
        }

        public int getConvertxiulianexp() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.convertxiulianexp;
        }

        public Set<Long> getCompensates() {
            Properties.this._xdb_verify_unsafe_();
            return Consts.constSet(Properties.this.compensates);
        }

        public Set<Long> getCompensatesAsData() {
            Properties.this._xdb_verify_unsafe_();
            Properties _o_ = Properties.this;
            Set<Long> compensates = new SetX();
            compensates.addAll(_o_.compensates);
            return compensates;
        }

        public Map<Integer, GatherMapItemInfo> getGather_map_item_infos() {
            Properties.this._xdb_verify_unsafe_();
            return Consts.constMap(Properties.this.gather_map_item_infos);
        }

        public Map<Integer, GatherMapItemInfo> getGather_map_item_infosAsData() {
            Properties.this._xdb_verify_unsafe_();
            Properties _o_ = Properties.this;
            Map<Integer, GatherMapItemInfo> gather_map_item_infos = new HashMap();
            Iterator i$ = _o_.gather_map_item_infos.entrySet().iterator();

            while(i$.hasNext()) {
                Map.Entry<Integer, GatherMapItemInfo> _e_ = (Map.Entry)i$.next();
                gather_map_item_infos.put(_e_.getKey(), new xbean.__.GatherMapItemInfo.Data((GatherMapItemInfo)_e_.getValue()));
            }

            return gather_map_item_infos;
        }

        public long getLastcalcuatetime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.lastcalcuatetime;
        }

        public int getDayonlineseconds() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.dayonlineseconds;
        }

        public long getOnlineseconds() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.onlineseconds;
        }

        public int getSend_recharge_times_tip_mail_no() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.send_recharge_times_tip_mail_no;
        }

        public long getLevelupcurtime() {
            Properties.this._xdb_verify_unsafe_();
            return Properties.this.levelupcurtime;
        }

        public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_map() {
            Properties.this._xdb_verify_unsafe_();
            return Consts.constMap(Properties.this.transfer_occupation_property_sys_map);
        }

        public Map<Integer, TransferOccupationPropertiesSys> getTransfer_occupation_property_sys_mapAsData() {
            Properties.this._xdb_verify_unsafe_();
            Properties _o_ = Properties.this;
            Map<Integer, TransferOccupationPropertiesSys> transfer_occupation_property_sys_map = new HashMap();
            Iterator i$ = _o_.transfer_occupation_property_sys_map.entrySet().iterator();

            while(i$.hasNext()) {
                Map.Entry<Integer, TransferOccupationPropertiesSys> _e_ = (Map.Entry)i$.next();
                transfer_occupation_property_sys_map.put(_e_.getKey(), new xbean.__.TransferOccupationPropertiesSys.Data((TransferOccupationPropertiesSys)_e_.getValue()));
            }

            return transfer_occupation_property_sys_map;
        }

        public Map<Integer, CoinInfo> getCoins() {
            Properties.this._xdb_verify_unsafe_();
            return Consts.constMap(Properties.this.coins);
        }

        public Map<Integer, CoinInfo> getCoinsAsData() {
            Properties.this._xdb_verify_unsafe_();
            Properties _o_ = Properties.this;
            Map<Integer, CoinInfo> coins = new HashMap();
            Iterator i$ = _o_.coins.entrySet().iterator();

            while(i$.hasNext()) {
                Map.Entry<Integer, CoinInfo> _e_ = (Map.Entry)i$.next();
                coins.put(_e_.getKey(), new xbean.__.CoinInfo.Data((CoinInfo)_e_.getValue()));
            }

            return coins;
        }

        public void setLevel(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setExp(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setHp(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setMp(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setAnger(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setVigor(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setActivitybpsys(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setTodaypropsysswitchcount(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setTimestamp(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setGold(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setSilver(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setGoldingot(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setDyecolorid(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setBaoshidu(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setLastlogintime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setLastlogofftime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setKeeponlinetime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setFightvalue(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setLeveluptime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setAccumulateleveluptime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setVigorrefreshtime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setConvertxiulianexp(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setLastcalcuatetime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setDayonlineseconds(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setOnlineseconds(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setSend_recharge_times_tip_mail_no(int _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public void setLevelupcurtime(long _v_) {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public Bean toConst() {
            Properties.this._xdb_verify_unsafe_();
            return this;
        }

        public boolean isConst() {
            Properties.this._xdb_verify_unsafe_();
            return true;
        }

        public boolean isData() {
            return Properties.this.isData();
        }

        public OctetsStream marshal(OctetsStream _os_) {
            return Properties.this.marshal(_os_);
        }

        public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public int getSerializedSize() {
            return Properties.this.getSerializedSize();
        }

        public CodedOutputStream marshal(CodedOutputStream _output_) throws InvalidProtocolBufferException {
            return Properties.this.marshal(_output_);
        }

        public CodedInputStream unmarshal(CodedInputStream _input_) throws InvalidProtocolBufferException {
            Properties.this._xdb_verify_unsafe_();
            throw new UnsupportedOperationException();
        }

        public Bean xdbParent() {
            return Properties.this.xdbParent();
        }

        public boolean xdbManaged() {
            return Properties.this.xdbManaged();
        }

        public String xdbVarname() {
            return Properties.this.xdbVarname();
        }

        public Long xdbObjId() {
            return Properties.this.xdbObjId();
        }

        public boolean equals(Object obj) {
            return Properties.this.equals(obj);
        }

        public int hashCode() {
            return Properties.this.hashCode();
        }

        public String toString() {
            return Properties.this.toString();
        }
    }
}
