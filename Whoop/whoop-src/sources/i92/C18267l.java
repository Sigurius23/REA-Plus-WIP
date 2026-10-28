package i92;

import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.network.model.ProfileDto;
import com.whoop.service.network.model.UserPreferenceDto;
import com.whoop.service.network.model.UserPreferences;
import pg3.C29218v0;
import xg3.C38280g;

/* JADX INFO: renamed from: i92.l */
/* JADX INFO: loaded from: classes4.dex */
public class C18267l {

    /* JADX INFO: renamed from: a */
    private final UsersPreferenceApi f71102a;

    /* JADX INFO: renamed from: b */
    private final C18270o f71103b;

    public C18267l(UsersPreferenceApi usersPreferenceApi, C18270o c18270o) {
        this.f71103b = c18270o;
        this.f71102a = usersPreferenceApi;
    }

    /* JADX INFO: renamed from: a */
    public C38280g<C29218v0<UserPreferences>> m52623a() {
        return AbstractC18274s.m52648m(this.f71102a.getUserPreferences());
    }

    /* JADX INFO: renamed from: b */
    public C38280g<C29218v0<UserPreferences>> m52624b(boolean z4) {
        return AbstractC18274s.m52648m(this.f71102a.setUserPreferences(new UserPreferenceDto(Boolean.valueOf(z4), null)));
    }

    /* JADX INFO: renamed from: c */
    public C38280g<C29218v0<ProfileDto>> m52625c() {
        return AbstractC18274s.m52648m(this.f71103b.m52633f());
    }
}
