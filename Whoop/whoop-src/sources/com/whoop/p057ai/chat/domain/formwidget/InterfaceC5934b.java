package com.whoop.p057ai.chat.domain.formwidget;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/b;", "", "a", "b", "c", "Lcom/whoop/ai/chat/domain/formwidget/b$a;", "Lcom/whoop/ai/chat/domain/formwidget/b$b;", "Lcom/whoop/ai/chat/domain/formwidget/b$c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC5934b {

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/b$a;", "Lcom/whoop/ai/chat/domain/formwidget/b;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC5934b {

        /* JADX INFO: renamed from: a */
        public static final a f23276a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/b$b;", "Lcom/whoop/ai/chat/domain/formwidget/b;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC5934b {

        /* JADX INFO: renamed from: a */
        public static final b f23277a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/b$c;", "Lcom/whoop/ai/chat/domain/formwidget/b;", "", "formKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC5934b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formKey;

        public c(String formKey) {
            AbstractC22676k.m65750j(formKey, "formKey");
            this.formKey = formKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.formKey, ((c) other).formKey);
        }

        public int hashCode() {
            return this.formKey.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RequestFailed(formKey=", this.formKey, ")");
        }
    }
}
