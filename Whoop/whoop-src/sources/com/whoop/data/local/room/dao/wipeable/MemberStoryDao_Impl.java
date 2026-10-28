package com.whoop.data.local.room.dao.wipeable;

import am2.C1023i0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.local.room.entity.AmaHost;
import com.whoop.domain.model.teams.MemberStory;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class MemberStoryDao_Impl implements MemberStoryDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfMemberStory = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `table_member_stories` (`memberStoryId`,`created_at`,`updated_at`,`title`,`publish_date`,`url`,`image`,`content_type`,`showBadge`,`description`,`deleted`,`featured`,`live`,`archived`,`live_time`,`host_id`,`url_text`,`cta_text`,`id`,`user_id`,`first_name`,`last_name`,`name`,`username`,`avatar_url`,`host_created_at`,`host_updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, MemberStory memberStory) {
            interfaceC33689c.mo5356p(1, memberStory.getMemberStoryId());
            if (memberStory.getCreatedAt() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, memberStory.getCreatedAt());
            }
            if (memberStory.getUpdatedAt() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, memberStory.getUpdatedAt());
            }
            if (memberStory.getTitle() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, memberStory.getTitle());
            }
            if (memberStory.getPublishDate() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, memberStory.getPublishDate());
            }
            if (memberStory.getUrl() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, memberStory.getUrl());
            }
            if (memberStory.getImage() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, memberStory.getImage());
            }
            if (memberStory.getContentType() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, memberStory.getContentType());
            }
            interfaceC33689c.mo5356p(9, memberStory.getShowBadge() ? 1L : 0L);
            if (memberStory.getDescription() == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, memberStory.getDescription());
            }
            interfaceC33689c.mo5356p(11, memberStory.getDeleted() ? 1L : 0L);
            interfaceC33689c.mo5356p(12, memberStory.getFeatured() ? 1L : 0L);
            interfaceC33689c.mo5356p(13, memberStory.getLive() ? 1L : 0L);
            interfaceC33689c.mo5356p(14, memberStory.getArchived() ? 1L : 0L);
            if (memberStory.getLiveTime() == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5354L(15, memberStory.getLiveTime());
            }
            interfaceC33689c.mo5356p(16, memberStory.getHostId());
            if (memberStory.getUrlText() == null) {
                interfaceC33689c.mo5359u(17);
            } else {
                interfaceC33689c.mo5354L(17, memberStory.getUrlText());
            }
            if (memberStory.getCtaText() == null) {
                interfaceC33689c.mo5359u(18);
            } else {
                interfaceC33689c.mo5354L(18, memberStory.getCtaText());
            }
            interfaceC33689c.mo5356p(19, memberStory.getId());
            AmaHost host = memberStory.getHost();
            if (host == null) {
                interfaceC33689c.mo5359u(20);
                interfaceC33689c.mo5359u(21);
                interfaceC33689c.mo5359u(22);
                interfaceC33689c.mo5359u(23);
                interfaceC33689c.mo5359u(24);
                interfaceC33689c.mo5359u(25);
                interfaceC33689c.mo5359u(26);
                interfaceC33689c.mo5359u(27);
                return;
            }
            if (host.getUserId() == null) {
                interfaceC33689c.mo5359u(20);
            } else {
                interfaceC33689c.mo5356p(20, host.getUserId().intValue());
            }
            if (host.getFirstName() == null) {
                interfaceC33689c.mo5359u(21);
            } else {
                interfaceC33689c.mo5354L(21, host.getFirstName());
            }
            if (host.getLastName() == null) {
                interfaceC33689c.mo5359u(22);
            } else {
                interfaceC33689c.mo5354L(22, host.getLastName());
            }
            if (host.getName() == null) {
                interfaceC33689c.mo5359u(23);
            } else {
                interfaceC33689c.mo5354L(23, host.getName());
            }
            if (host.getUsername() == null) {
                interfaceC33689c.mo5359u(24);
            } else {
                interfaceC33689c.mo5354L(24, host.getUsername());
            }
            if (host.getAvatarUrl() == null) {
                interfaceC33689c.mo5359u(25);
            } else {
                interfaceC33689c.mo5354L(25, host.getAvatarUrl());
            }
            if (host.getHostCreatedAt() == null) {
                interfaceC33689c.mo5359u(26);
            } else {
                interfaceC33689c.mo5354L(26, host.getHostCreatedAt());
            }
            if (host.getHostUpdatedAt() == null) {
                interfaceC33689c.mo5359u(27);
            } else {
                interfaceC33689c.mo5354L(27, host.getHostUpdatedAt());
            }
        }
    };

    public MemberStoryDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$addMemberStories$1(List list, InterfaceC30057d interfaceC30057d) {
        return super.addMemberStories(list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAllMemberStories$6(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_member_stories");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0283 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x029b A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02aa A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c8 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d7 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e6 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02f5 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    public static /* synthetic */ List lambda$getFlowMemberStoryData$4(InterfaceC33687a interfaceC33687a) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        AmaHost amaHost;
        Integer numValueOf;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        String strMo5353J3;
        String strMo5353J4;
        String strMo5353J5;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_member_stories");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberStoryId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "created_at");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updated_at");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "publish_date");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryParams.URL);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "content_type");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "featured");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "archived");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live_time");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_id");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "url_text");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cta_text");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "first_name");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_name");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "username");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avatar_url");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_created_at");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_updated_at");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i34 = iM60658N14;
                ArrayList arrayList2 = arrayList;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J9 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                int i36 = iM60658N4;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N13)) != 0;
                int i37 = iM60658N5;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i34)) != 0;
                int i38 = iM60658N15;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i38) ? null : interfaceC33689cMo68212g1.mo5353J0(i38);
                int i39 = iM60658N16;
                int i44 = (int) interfaceC33689cMo68212g1.getLong(i39);
                int i45 = iM60658N17;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45);
                int i46 = iM60658N;
                int i47 = iM60658N18;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47);
                iM60658N18 = i47;
                int i48 = iM60658N20;
                if (interfaceC33689cMo68212g1.isNull(i48)) {
                    i13 = i44;
                    i15 = iM60658N21;
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        i14 = i45;
                        i16 = iM60658N22;
                        if (interfaceC33689cMo68212g1.isNull(i16)) {
                            i17 = i38;
                            i19 = iM60658N23;
                            if (interfaceC33689cMo68212g1.isNull(i19)) {
                                i18 = i39;
                                i24 = iM60658N24;
                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                    i25 = iM60658N6;
                                    i27 = iM60658N25;
                                    if (interfaceC33689cMo68212g1.isNull(i27)) {
                                        i26 = iM60658N7;
                                        i28 = iM60658N26;
                                        if (interfaceC33689cMo68212g1.isNull(i28)) {
                                            iM60658N8 = iM60658N8;
                                            i29 = iM60658N27;
                                            if (interfaceC33689cMo68212g1.isNull(i29)) {
                                                iM60658N9 = iM60658N9;
                                                iM60658N10 = iM60658N10;
                                                amaHost = null;
                                            } else {
                                                if (interfaceC33689cMo68212g1.isNull(i48)) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                                    strMo5353J0 = null;
                                                } else {
                                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                                    strMo5353J1 = null;
                                                } else {
                                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i19)) {
                                                    strMo5353J2 = null;
                                                } else {
                                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                                    strMo5353J3 = null;
                                                } else {
                                                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i27)) {
                                                    strMo5353J4 = null;
                                                } else {
                                                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i28)) {
                                                    strMo5353J5 = null;
                                                } else {
                                                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                                                }
                                                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                                            }
                                        }
                                    }
                                    MemberStory memberStory = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                                    int i49 = i15;
                                    int i54 = iM60658N19;
                                    int i55 = i16;
                                    memberStory.setId(interfaceC33689cMo68212g1.getLong(i54));
                                    arrayList2.add(memberStory);
                                    int i56 = i19;
                                    iM60658N4 = i36;
                                    iM60658N15 = i17;
                                    iM60658N21 = i49;
                                    iM60658N14 = i34;
                                    iM60658N16 = i18;
                                    iM60658N22 = i55;
                                    iM60658N19 = i54;
                                    iM60658N10 = iM60658N10;
                                    iM60658N27 = i29;
                                    iM60658N8 = iM60658N8;
                                    iM60658N25 = i27;
                                    iM60658N6 = i25;
                                    iM60658N23 = i56;
                                    int i57 = i14;
                                    iM60658N20 = i48;
                                    iM60658N = i46;
                                    iM60658N17 = i57;
                                    arrayList = arrayList2;
                                    iM60658N2 = iM60658N2;
                                    iM60658N9 = iM60658N9;
                                    iM60658N3 = iM60658N3;
                                    iM60658N26 = i28;
                                    iM60658N7 = i26;
                                    iM60658N24 = i24;
                                    iM60658N5 = i37;
                                }
                                i29 = iM60658N27;
                                if (interfaceC33689cMo68212g1.isNull(i48)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i19)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                    strMo5353J3 = null;
                                } else {
                                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i27)) {
                                    strMo5353J4 = null;
                                } else {
                                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i28)) {
                                    strMo5353J5 = null;
                                } else {
                                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                                }
                                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                                MemberStory memberStory2 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                                int i410 = i15;
                                int i58 = iM60658N19;
                                int i59 = i16;
                                memberStory2.setId(interfaceC33689cMo68212g1.getLong(i58));
                                arrayList2.add(memberStory2);
                                int i510 = i19;
                                iM60658N4 = i36;
                                iM60658N15 = i17;
                                iM60658N21 = i410;
                                iM60658N14 = i34;
                                iM60658N16 = i18;
                                iM60658N22 = i59;
                                iM60658N19 = i58;
                                iM60658N10 = iM60658N10;
                                iM60658N27 = i29;
                                iM60658N8 = iM60658N8;
                                iM60658N25 = i27;
                                iM60658N6 = i25;
                                iM60658N23 = i510;
                                int i511 = i14;
                                iM60658N20 = i48;
                                iM60658N = i46;
                                iM60658N17 = i511;
                                arrayList = arrayList2;
                                iM60658N2 = iM60658N2;
                                iM60658N9 = iM60658N9;
                                iM60658N3 = iM60658N3;
                                iM60658N26 = i28;
                                iM60658N7 = i26;
                                iM60658N24 = i24;
                                iM60658N5 = i37;
                            }
                            i26 = iM60658N7;
                            i28 = iM60658N26;
                            i29 = iM60658N27;
                            if (interfaceC33689cMo68212g1.isNull(i48)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i19)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i24)) {
                                strMo5353J3 = null;
                            } else {
                                strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i27)) {
                                strMo5353J4 = null;
                            } else {
                                strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i28)) {
                                strMo5353J5 = null;
                            } else {
                                strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                            }
                            amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                            MemberStory memberStory3 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                            int i411 = i15;
                            int i512 = iM60658N19;
                            int i513 = i16;
                            memberStory3.setId(interfaceC33689cMo68212g1.getLong(i512));
                            arrayList2.add(memberStory3);
                            int i514 = i19;
                            iM60658N4 = i36;
                            iM60658N15 = i17;
                            iM60658N21 = i411;
                            iM60658N14 = i34;
                            iM60658N16 = i18;
                            iM60658N22 = i513;
                            iM60658N19 = i512;
                            iM60658N10 = iM60658N10;
                            iM60658N27 = i29;
                            iM60658N8 = iM60658N8;
                            iM60658N25 = i27;
                            iM60658N6 = i25;
                            iM60658N23 = i514;
                            int i515 = i14;
                            iM60658N20 = i48;
                            iM60658N = i46;
                            iM60658N17 = i515;
                            arrayList = arrayList2;
                            iM60658N2 = iM60658N2;
                            iM60658N9 = iM60658N9;
                            iM60658N3 = iM60658N3;
                            iM60658N26 = i28;
                            iM60658N7 = i26;
                            iM60658N24 = i24;
                            iM60658N5 = i37;
                        }
                        i25 = iM60658N6;
                        i26 = iM60658N7;
                        i27 = iM60658N25;
                        i28 = iM60658N26;
                        i29 = iM60658N27;
                        if (interfaceC33689cMo68212g1.isNull(i48)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i16)) {
                            strMo5353J1 = null;
                        } else {
                            strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i19)) {
                            strMo5353J2 = null;
                        } else {
                            strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i24)) {
                            strMo5353J3 = null;
                        } else {
                            strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i27)) {
                            strMo5353J4 = null;
                        } else {
                            strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i28)) {
                            strMo5353J5 = null;
                        } else {
                            strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                        }
                        amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                        MemberStory memberStory4 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                        int i412 = i15;
                        int i516 = iM60658N19;
                        int i517 = i16;
                        memberStory4.setId(interfaceC33689cMo68212g1.getLong(i516));
                        arrayList2.add(memberStory4);
                        int i518 = i19;
                        iM60658N4 = i36;
                        iM60658N15 = i17;
                        iM60658N21 = i412;
                        iM60658N14 = i34;
                        iM60658N16 = i18;
                        iM60658N22 = i517;
                        iM60658N19 = i516;
                        iM60658N10 = iM60658N10;
                        iM60658N27 = i29;
                        iM60658N8 = iM60658N8;
                        iM60658N25 = i27;
                        iM60658N6 = i25;
                        iM60658N23 = i518;
                        int i519 = i14;
                        iM60658N20 = i48;
                        iM60658N = i46;
                        iM60658N17 = i519;
                        arrayList = arrayList2;
                        iM60658N2 = iM60658N2;
                        iM60658N9 = iM60658N9;
                        iM60658N3 = iM60658N3;
                        iM60658N26 = i28;
                        iM60658N7 = i26;
                        iM60658N24 = i24;
                        iM60658N5 = i37;
                    } else {
                        i14 = i45;
                        i17 = i38;
                        i16 = iM60658N22;
                        i19 = iM60658N23;
                    }
                    i18 = i39;
                    i25 = iM60658N6;
                    i24 = iM60658N24;
                    i27 = iM60658N25;
                    i26 = iM60658N7;
                    i28 = iM60658N26;
                    i29 = iM60658N27;
                    if (interfaceC33689cMo68212g1.isNull(i48)) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                    }
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        strMo5353J0 = null;
                    } else {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                        strMo5353J1 = null;
                    } else {
                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i19)) {
                        strMo5353J2 = null;
                    } else {
                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i24)) {
                        strMo5353J3 = null;
                    } else {
                        strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i27)) {
                        strMo5353J4 = null;
                    } else {
                        strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i28)) {
                        strMo5353J5 = null;
                    } else {
                        strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                    }
                    amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                    MemberStory memberStory5 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                    int i413 = i15;
                    int i5110 = iM60658N19;
                    int i5111 = i16;
                    memberStory5.setId(interfaceC33689cMo68212g1.getLong(i5110));
                    arrayList2.add(memberStory5);
                    int i5112 = i19;
                    iM60658N4 = i36;
                    iM60658N15 = i17;
                    iM60658N21 = i413;
                    iM60658N14 = i34;
                    iM60658N16 = i18;
                    iM60658N22 = i5111;
                    iM60658N19 = i5110;
                    iM60658N10 = iM60658N10;
                    iM60658N27 = i29;
                    iM60658N8 = iM60658N8;
                    iM60658N25 = i27;
                    iM60658N6 = i25;
                    iM60658N23 = i5112;
                    int i5113 = i14;
                    iM60658N20 = i48;
                    iM60658N = i46;
                    iM60658N17 = i5113;
                    arrayList = arrayList2;
                    iM60658N2 = iM60658N2;
                    iM60658N9 = iM60658N9;
                    iM60658N3 = iM60658N3;
                    iM60658N26 = i28;
                    iM60658N7 = i26;
                    iM60658N24 = i24;
                    iM60658N5 = i37;
                } else {
                    i13 = i44;
                    i14 = i45;
                    i15 = iM60658N21;
                    i16 = iM60658N22;
                }
                i17 = i38;
                i18 = i39;
                i19 = iM60658N23;
                i24 = iM60658N24;
                i25 = iM60658N6;
                i26 = iM60658N7;
                i27 = iM60658N25;
                i28 = iM60658N26;
                i29 = iM60658N27;
                if (interfaceC33689cMo68212g1.isNull(i48)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                }
                if (interfaceC33689cMo68212g1.isNull(i19)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                }
                if (interfaceC33689cMo68212g1.isNull(i24)) {
                    strMo5353J3 = null;
                } else {
                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                }
                if (interfaceC33689cMo68212g1.isNull(i27)) {
                    strMo5353J4 = null;
                } else {
                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                }
                if (interfaceC33689cMo68212g1.isNull(i28)) {
                    strMo5353J5 = null;
                } else {
                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                }
                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                MemberStory memberStory6 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                int i414 = i15;
                int i5114 = iM60658N19;
                int i5115 = i16;
                memberStory6.setId(interfaceC33689cMo68212g1.getLong(i5114));
                arrayList2.add(memberStory6);
                int i5116 = i19;
                iM60658N4 = i36;
                iM60658N15 = i17;
                iM60658N21 = i414;
                iM60658N14 = i34;
                iM60658N16 = i18;
                iM60658N22 = i5115;
                iM60658N19 = i5114;
                iM60658N10 = iM60658N10;
                iM60658N27 = i29;
                iM60658N8 = iM60658N8;
                iM60658N25 = i27;
                iM60658N6 = i25;
                iM60658N23 = i5116;
                int i5117 = i14;
                iM60658N20 = i48;
                iM60658N = i46;
                iM60658N17 = i5117;
                arrayList = arrayList2;
                iM60658N2 = iM60658N2;
                iM60658N9 = iM60658N9;
                iM60658N3 = iM60658N3;
                iM60658N26 = i28;
                iM60658N7 = i26;
                iM60658N24 = i24;
                iM60658N5 = i37;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x0234 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:108:0x0248 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0254  */
    /* JADX WARN: Code duplicated, block: B:112:0x0257 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0263  */
    /* JADX WARN: Code duplicated, block: B:116:0x0266 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0272  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0281  */
    /* JADX WARN: Code duplicated, block: B:124:0x0284 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0290  */
    /* JADX WARN: Code duplicated, block: B:128:0x0293 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02a2 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x000c, B:5:0x00d1, B:9:0x00e9, B:13:0x00f8, B:17:0x0107, B:21:0x0116, B:25:0x0125, B:29:0x0134, B:33:0x0143, B:37:0x0150, B:41:0x015f, B:45:0x016b, B:50:0x017a, B:55:0x0189, B:60:0x0198, B:65:0x01aa, B:70:0x01c3, B:75:0x01d5, B:77:0x01db, B:79:0x01e3, B:81:0x01eb, B:83:0x01f3, B:85:0x01fb, B:87:0x0203, B:89:0x020b, B:134:0x02ac, B:101:0x022b, B:105:0x023f, B:109:0x024e, B:113:0x025d, B:117:0x026c, B:121:0x027b, B:125:0x028a, B:129:0x0299, B:133:0x02a7, B:132:0x02a2, B:128:0x0293, B:124:0x0284, B:120:0x0275, B:116:0x0266, B:112:0x0257, B:108:0x0248, B:104:0x0234, B:74:0x01ce, B:69:0x01bc, B:64:0x01a3, B:40:0x0159, B:32:0x013d, B:28:0x012e, B:24:0x011f, B:20:0x0110, B:16:0x0101, B:12:0x00f2, B:8:0x00e3), top: B:140:0x000c }] */
    public static /* synthetic */ MemberStory lambda$getMemberStoryById$5(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Integer numValueOf;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        String strMo5353J3;
        String strMo5353J4;
        String strMo5353J5;
        AmaHost amaHost;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * from table_member_stories WHERE memberStoryId= (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberStoryId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "created_at");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updated_at");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "publish_date");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryParams.URL);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "content_type");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "featured");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "archived");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live_time");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_id");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "url_text");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cta_text");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "first_name");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_name");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "username");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avatar_url");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_created_at");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_updated_at");
            MemberStory memberStory = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                int i24 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J9 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N13)) != 0;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N14)) != 0;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15);
                int i25 = (int) interfaceC33689cMo68212g1.getLong(iM60658N16);
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N17) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N17);
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18);
                if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                    i14 = iM60658N21;
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        i15 = iM60658N22;
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            i16 = iM60658N23;
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                i17 = iM60658N24;
                                if (interfaceC33689cMo68212g1.isNull(i17)) {
                                    i18 = iM60658N25;
                                    if (interfaceC33689cMo68212g1.isNull(i18)) {
                                        i19 = iM60658N26;
                                        if (interfaceC33689cMo68212g1.isNull(i19) && interfaceC33689cMo68212g1.isNull(iM60658N27)) {
                                            amaHost = null;
                                        }
                                        MemberStory memberStory2 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                                        memberStory2.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                                        memberStory = memberStory2;
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                                        strMo5353J2 = null;
                                    } else {
                                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i17)) {
                                        strMo5353J3 = null;
                                    } else {
                                        strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i18)) {
                                        strMo5353J4 = null;
                                    } else {
                                        strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i19)) {
                                        strMo5353J5 = null;
                                    } else {
                                        strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                    }
                                    amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                                    MemberStory memberStory3 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                                    memberStory3.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                                    memberStory = memberStory3;
                                }
                                i19 = iM60658N26;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                                }
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i17)) {
                                    strMo5353J3 = null;
                                } else {
                                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i18)) {
                                    strMo5353J4 = null;
                                } else {
                                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i19)) {
                                    strMo5353J5 = null;
                                } else {
                                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                }
                                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                                MemberStory memberStory4 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                                memberStory4.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                                memberStory = memberStory4;
                            }
                            i18 = iM60658N25;
                            i19 = iM60658N26;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                            }
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i17)) {
                                strMo5353J3 = null;
                            } else {
                                strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i18)) {
                                strMo5353J4 = null;
                            } else {
                                strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i19)) {
                                strMo5353J5 = null;
                            } else {
                                strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                            }
                            amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                            MemberStory memberStory5 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                            memberStory5.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                            memberStory = memberStory5;
                        }
                        i17 = iM60658N24;
                        i18 = iM60658N25;
                        i19 = iM60658N26;
                        if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            strMo5353J1 = null;
                        } else {
                            strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i16)) {
                            strMo5353J2 = null;
                        } else {
                            strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i17)) {
                            strMo5353J3 = null;
                        } else {
                            strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i18)) {
                            strMo5353J4 = null;
                        } else {
                            strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i19)) {
                            strMo5353J5 = null;
                        } else {
                            strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                        }
                        amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                        MemberStory memberStory6 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                        memberStory6.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                        memberStory = memberStory6;
                    }
                    i16 = iM60658N23;
                    i17 = iM60658N24;
                    i18 = iM60658N25;
                    i19 = iM60658N26;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                    }
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        strMo5353J0 = null;
                    } else {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        strMo5353J1 = null;
                    } else {
                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                        strMo5353J2 = null;
                    } else {
                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i17)) {
                        strMo5353J3 = null;
                    } else {
                        strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i18)) {
                        strMo5353J4 = null;
                    } else {
                        strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i19)) {
                        strMo5353J5 = null;
                    } else {
                        strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                    }
                    amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                    MemberStory memberStory7 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                    memberStory7.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                    memberStory = memberStory7;
                } else {
                    i14 = iM60658N21;
                }
                i15 = iM60658N22;
                i16 = iM60658N23;
                i17 = iM60658N24;
                i18 = iM60658N25;
                i19 = iM60658N26;
                if (interfaceC33689cMo68212g1.isNull(iM60658N20)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N20));
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i14);
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                }
                if (interfaceC33689cMo68212g1.isNull(i17)) {
                    strMo5353J3 = null;
                } else {
                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i17);
                }
                if (interfaceC33689cMo68212g1.isNull(i18)) {
                    strMo5353J4 = null;
                } else {
                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i18);
                }
                if (interfaceC33689cMo68212g1.isNull(i19)) {
                    strMo5353J5 = null;
                } else {
                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i19);
                }
                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27));
                MemberStory memberStory8 = new MemberStory(i24, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i25, strMo5353J15, strMo5353J16, amaHost);
                memberStory8.setId(interfaceC33689cMo68212g1.getLong(iM60658N19));
                memberStory = memberStory8;
            }
            return memberStory;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0283 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x029b A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02aa A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c8 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d7 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e6 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02f5 A[Catch: all -> 0x023a, TryCatch #0 {all -> 0x023a, blocks: (B:3:0x0008, B:4:0x00c9, B:6:0x00cf, B:10:0x00e9, B:14:0x00f8, B:18:0x0107, B:22:0x0116, B:26:0x0125, B:30:0x0134, B:34:0x0149, B:38:0x0157, B:43:0x0168, B:47:0x0174, B:51:0x0180, B:56:0x0191, B:61:0x01a0, B:66:0x01b6, B:71:0x01d1, B:76:0x01e5, B:78:0x01eb, B:80:0x01f5, B:82:0x01ff, B:84:0x0209, B:86:0x0213, B:88:0x021d, B:90:0x0227, B:104:0x0276, B:108:0x0292, B:112:0x02a1, B:116:0x02b0, B:120:0x02bf, B:124:0x02ce, B:128:0x02dd, B:132:0x02ec, B:136:0x02fa, B:137:0x0301, B:135:0x02f5, B:131:0x02e6, B:127:0x02d7, B:123:0x02c8, B:119:0x02b9, B:115:0x02aa, B:111:0x029b, B:107:0x0283, B:75:0x01de, B:70:0x01ca, B:65:0x01af, B:42:0x0161, B:33:0x0140, B:29:0x012e, B:25:0x011f, B:21:0x0110, B:17:0x0101, B:13:0x00f2, B:9:0x00e3), top: B:143:0x0008 }] */
    public static /* synthetic */ List lambda$getMemberStoryData$3(InterfaceC33687a interfaceC33687a) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        AmaHost amaHost;
        Integer numValueOf;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        String strMo5353J3;
        String strMo5353J4;
        String strMo5353J5;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_member_stories");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberStoryId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "created_at");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updated_at");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "publish_date");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, QueryParams.URL);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "content_type");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "featured");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "archived");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "live_time");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_id");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "url_text");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cta_text");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "first_name");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_name");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "username");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avatar_url");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_created_at");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "host_updated_at");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i34 = iM60658N14;
                ArrayList arrayList2 = arrayList;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J9 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                int i36 = iM60658N4;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N11)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N13)) != 0;
                int i37 = iM60658N5;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i34)) != 0;
                int i38 = iM60658N15;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i38) ? null : interfaceC33689cMo68212g1.mo5353J0(i38);
                int i39 = iM60658N16;
                int i44 = (int) interfaceC33689cMo68212g1.getLong(i39);
                int i45 = iM60658N17;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45);
                int i46 = iM60658N;
                int i47 = iM60658N18;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47);
                iM60658N18 = i47;
                int i48 = iM60658N20;
                if (interfaceC33689cMo68212g1.isNull(i48)) {
                    i13 = i44;
                    i15 = iM60658N21;
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        i14 = i45;
                        i16 = iM60658N22;
                        if (interfaceC33689cMo68212g1.isNull(i16)) {
                            i17 = i38;
                            i19 = iM60658N23;
                            if (interfaceC33689cMo68212g1.isNull(i19)) {
                                i18 = i39;
                                i24 = iM60658N24;
                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                    i25 = iM60658N6;
                                    i27 = iM60658N25;
                                    if (interfaceC33689cMo68212g1.isNull(i27)) {
                                        i26 = iM60658N7;
                                        i28 = iM60658N26;
                                        if (interfaceC33689cMo68212g1.isNull(i28)) {
                                            iM60658N8 = iM60658N8;
                                            i29 = iM60658N27;
                                            if (interfaceC33689cMo68212g1.isNull(i29)) {
                                                iM60658N9 = iM60658N9;
                                                iM60658N10 = iM60658N10;
                                                amaHost = null;
                                            } else {
                                                if (interfaceC33689cMo68212g1.isNull(i48)) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                                    strMo5353J0 = null;
                                                } else {
                                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                                    strMo5353J1 = null;
                                                } else {
                                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i19)) {
                                                    strMo5353J2 = null;
                                                } else {
                                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                                    strMo5353J3 = null;
                                                } else {
                                                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i27)) {
                                                    strMo5353J4 = null;
                                                } else {
                                                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                                                }
                                                if (interfaceC33689cMo68212g1.isNull(i28)) {
                                                    strMo5353J5 = null;
                                                } else {
                                                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                                                }
                                                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                                            }
                                        }
                                    }
                                    MemberStory memberStory = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                                    int i49 = i15;
                                    int i54 = iM60658N19;
                                    int i55 = i16;
                                    memberStory.setId(interfaceC33689cMo68212g1.getLong(i54));
                                    arrayList2.add(memberStory);
                                    int i56 = i19;
                                    iM60658N4 = i36;
                                    iM60658N15 = i17;
                                    iM60658N21 = i49;
                                    iM60658N14 = i34;
                                    iM60658N16 = i18;
                                    iM60658N22 = i55;
                                    iM60658N19 = i54;
                                    iM60658N10 = iM60658N10;
                                    iM60658N27 = i29;
                                    iM60658N8 = iM60658N8;
                                    iM60658N25 = i27;
                                    iM60658N6 = i25;
                                    iM60658N23 = i56;
                                    int i57 = i14;
                                    iM60658N20 = i48;
                                    iM60658N = i46;
                                    iM60658N17 = i57;
                                    arrayList = arrayList2;
                                    iM60658N2 = iM60658N2;
                                    iM60658N9 = iM60658N9;
                                    iM60658N3 = iM60658N3;
                                    iM60658N26 = i28;
                                    iM60658N7 = i26;
                                    iM60658N24 = i24;
                                    iM60658N5 = i37;
                                }
                                i29 = iM60658N27;
                                if (interfaceC33689cMo68212g1.isNull(i48)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i19)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i24)) {
                                    strMo5353J3 = null;
                                } else {
                                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i27)) {
                                    strMo5353J4 = null;
                                } else {
                                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i28)) {
                                    strMo5353J5 = null;
                                } else {
                                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                                }
                                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                                MemberStory memberStory2 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                                int i410 = i15;
                                int i58 = iM60658N19;
                                int i59 = i16;
                                memberStory2.setId(interfaceC33689cMo68212g1.getLong(i58));
                                arrayList2.add(memberStory2);
                                int i510 = i19;
                                iM60658N4 = i36;
                                iM60658N15 = i17;
                                iM60658N21 = i410;
                                iM60658N14 = i34;
                                iM60658N16 = i18;
                                iM60658N22 = i59;
                                iM60658N19 = i58;
                                iM60658N10 = iM60658N10;
                                iM60658N27 = i29;
                                iM60658N8 = iM60658N8;
                                iM60658N25 = i27;
                                iM60658N6 = i25;
                                iM60658N23 = i510;
                                int i511 = i14;
                                iM60658N20 = i48;
                                iM60658N = i46;
                                iM60658N17 = i511;
                                arrayList = arrayList2;
                                iM60658N2 = iM60658N2;
                                iM60658N9 = iM60658N9;
                                iM60658N3 = iM60658N3;
                                iM60658N26 = i28;
                                iM60658N7 = i26;
                                iM60658N24 = i24;
                                iM60658N5 = i37;
                            }
                            i26 = iM60658N7;
                            i28 = iM60658N26;
                            i29 = iM60658N27;
                            if (interfaceC33689cMo68212g1.isNull(i48)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i19)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i24)) {
                                strMo5353J3 = null;
                            } else {
                                strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i27)) {
                                strMo5353J4 = null;
                            } else {
                                strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i28)) {
                                strMo5353J5 = null;
                            } else {
                                strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                            }
                            amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                            MemberStory memberStory3 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                            int i411 = i15;
                            int i512 = iM60658N19;
                            int i513 = i16;
                            memberStory3.setId(interfaceC33689cMo68212g1.getLong(i512));
                            arrayList2.add(memberStory3);
                            int i514 = i19;
                            iM60658N4 = i36;
                            iM60658N15 = i17;
                            iM60658N21 = i411;
                            iM60658N14 = i34;
                            iM60658N16 = i18;
                            iM60658N22 = i513;
                            iM60658N19 = i512;
                            iM60658N10 = iM60658N10;
                            iM60658N27 = i29;
                            iM60658N8 = iM60658N8;
                            iM60658N25 = i27;
                            iM60658N6 = i25;
                            iM60658N23 = i514;
                            int i515 = i14;
                            iM60658N20 = i48;
                            iM60658N = i46;
                            iM60658N17 = i515;
                            arrayList = arrayList2;
                            iM60658N2 = iM60658N2;
                            iM60658N9 = iM60658N9;
                            iM60658N3 = iM60658N3;
                            iM60658N26 = i28;
                            iM60658N7 = i26;
                            iM60658N24 = i24;
                            iM60658N5 = i37;
                        }
                        i25 = iM60658N6;
                        i26 = iM60658N7;
                        i27 = iM60658N25;
                        i28 = iM60658N26;
                        i29 = iM60658N27;
                        if (interfaceC33689cMo68212g1.isNull(i48)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                        }
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i16)) {
                            strMo5353J1 = null;
                        } else {
                            strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i19)) {
                            strMo5353J2 = null;
                        } else {
                            strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i24)) {
                            strMo5353J3 = null;
                        } else {
                            strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i27)) {
                            strMo5353J4 = null;
                        } else {
                            strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i28)) {
                            strMo5353J5 = null;
                        } else {
                            strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                        }
                        amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                        MemberStory memberStory4 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                        int i412 = i15;
                        int i516 = iM60658N19;
                        int i517 = i16;
                        memberStory4.setId(interfaceC33689cMo68212g1.getLong(i516));
                        arrayList2.add(memberStory4);
                        int i518 = i19;
                        iM60658N4 = i36;
                        iM60658N15 = i17;
                        iM60658N21 = i412;
                        iM60658N14 = i34;
                        iM60658N16 = i18;
                        iM60658N22 = i517;
                        iM60658N19 = i516;
                        iM60658N10 = iM60658N10;
                        iM60658N27 = i29;
                        iM60658N8 = iM60658N8;
                        iM60658N25 = i27;
                        iM60658N6 = i25;
                        iM60658N23 = i518;
                        int i519 = i14;
                        iM60658N20 = i48;
                        iM60658N = i46;
                        iM60658N17 = i519;
                        arrayList = arrayList2;
                        iM60658N2 = iM60658N2;
                        iM60658N9 = iM60658N9;
                        iM60658N3 = iM60658N3;
                        iM60658N26 = i28;
                        iM60658N7 = i26;
                        iM60658N24 = i24;
                        iM60658N5 = i37;
                    } else {
                        i14 = i45;
                        i17 = i38;
                        i16 = iM60658N22;
                        i19 = iM60658N23;
                    }
                    i18 = i39;
                    i25 = iM60658N6;
                    i24 = iM60658N24;
                    i27 = iM60658N25;
                    i26 = iM60658N7;
                    i28 = iM60658N26;
                    i29 = iM60658N27;
                    if (interfaceC33689cMo68212g1.isNull(i48)) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                    }
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        strMo5353J0 = null;
                    } else {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                        strMo5353J1 = null;
                    } else {
                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i19)) {
                        strMo5353J2 = null;
                    } else {
                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i24)) {
                        strMo5353J3 = null;
                    } else {
                        strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i27)) {
                        strMo5353J4 = null;
                    } else {
                        strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i28)) {
                        strMo5353J5 = null;
                    } else {
                        strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                    }
                    amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                    MemberStory memberStory5 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                    int i413 = i15;
                    int i5110 = iM60658N19;
                    int i5111 = i16;
                    memberStory5.setId(interfaceC33689cMo68212g1.getLong(i5110));
                    arrayList2.add(memberStory5);
                    int i5112 = i19;
                    iM60658N4 = i36;
                    iM60658N15 = i17;
                    iM60658N21 = i413;
                    iM60658N14 = i34;
                    iM60658N16 = i18;
                    iM60658N22 = i5111;
                    iM60658N19 = i5110;
                    iM60658N10 = iM60658N10;
                    iM60658N27 = i29;
                    iM60658N8 = iM60658N8;
                    iM60658N25 = i27;
                    iM60658N6 = i25;
                    iM60658N23 = i5112;
                    int i5113 = i14;
                    iM60658N20 = i48;
                    iM60658N = i46;
                    iM60658N17 = i5113;
                    arrayList = arrayList2;
                    iM60658N2 = iM60658N2;
                    iM60658N9 = iM60658N9;
                    iM60658N3 = iM60658N3;
                    iM60658N26 = i28;
                    iM60658N7 = i26;
                    iM60658N24 = i24;
                    iM60658N5 = i37;
                } else {
                    i13 = i44;
                    i14 = i45;
                    i15 = iM60658N21;
                    i16 = iM60658N22;
                }
                i17 = i38;
                i18 = i39;
                i19 = iM60658N23;
                i24 = iM60658N24;
                i25 = iM60658N6;
                i26 = iM60658N7;
                i27 = iM60658N25;
                i28 = iM60658N26;
                i29 = iM60658N27;
                if (interfaceC33689cMo68212g1.isNull(i48)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i48));
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i16);
                }
                if (interfaceC33689cMo68212g1.isNull(i19)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i19);
                }
                if (interfaceC33689cMo68212g1.isNull(i24)) {
                    strMo5353J3 = null;
                } else {
                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i24);
                }
                if (interfaceC33689cMo68212g1.isNull(i27)) {
                    strMo5353J4 = null;
                } else {
                    strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i27);
                }
                if (interfaceC33689cMo68212g1.isNull(i28)) {
                    strMo5353J5 = null;
                } else {
                    strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i28);
                }
                amaHost = new AmaHost(numValueOf, strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, interfaceC33689cMo68212g1.isNull(i29) ? null : interfaceC33689cMo68212g1.mo5353J0(i29));
                MemberStory memberStory6 = new MemberStory(i35, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, strMo5353J12, z4, strMo5353J13, z13, z14, z15, z16, strMo5353J14, i13, strMo5353J15, strMo5353J16, amaHost);
                int i414 = i15;
                int i5114 = iM60658N19;
                int i5115 = i16;
                memberStory6.setId(interfaceC33689cMo68212g1.getLong(i5114));
                arrayList2.add(memberStory6);
                int i5116 = i19;
                iM60658N4 = i36;
                iM60658N15 = i17;
                iM60658N21 = i414;
                iM60658N14 = i34;
                iM60658N16 = i18;
                iM60658N22 = i5115;
                iM60658N19 = i5114;
                iM60658N10 = iM60658N10;
                iM60658N27 = i29;
                iM60658N8 = iM60658N8;
                iM60658N25 = i27;
                iM60658N6 = i25;
                iM60658N23 = i5116;
                int i5117 = i14;
                iM60658N20 = i48;
                iM60658N = i46;
                iM60658N17 = i5117;
                arrayList = arrayList2;
                iM60658N2 = iM60658N2;
                iM60658N9 = iM60658N9;
                iM60658N3 = iM60658N3;
                iM60658N26 = i28;
                iM60658N7 = i26;
                iM60658N24 = i24;
                iM60658N5 = i37;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$saveMemberStory$0(MemberStory memberStory, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfMemberStory.insert(interfaceC33687a, memberStory);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateAllBadgeStatus$2(boolean z4, List list, InterfaceC30057d interfaceC30057d) {
        return super.updateAllBadgeStatus(z4, list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$updateBannerStatus$7(boolean z4, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("UPDATE table_member_stories SET showBadge = (?) WHERE memberStoryId = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object addMemberStories(List<MemberStory> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C3169c(24, this, list), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object deleteAllMemberStories(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6498i(5), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public InterfaceC13058l getFlowMemberStoryData() {
        return AbstractC12350b.m34591l(this.__db, new String[]{"table_member_stories"}, new C6498i(7));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public MemberStory getMemberStoryById(int i13) {
        return (MemberStory) AbstractC15751g.m44432L(this.__db, true, false, new C6494e(i13, 1));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object getMemberStoryData(InterfaceC30057d<? super List<MemberStory>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6498i(6), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object saveMemberStory(MemberStory memberStory, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        memberStory.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3169c(23, this, memberStory), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object updateAllBadgeStatus(boolean z4, List<MemberStory> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C1023i0(this, z4, list, 3), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.MemberStoryDao
    public Object updateBannerStatus(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6514a(z4, i13, 1), interfaceC30057d);
    }
}
