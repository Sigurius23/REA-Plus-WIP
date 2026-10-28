.class public abstract Lio/sentry/android/core/anr/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lio/sentry/android/core/anr/c;->a:Ljava/util/ArrayList;

    const-string v1, "android.app"

    const-string v2, "android.os.Handler"

    const-string v3, "java.lang"

    const-string v4, "java.util"

    invoke-static {v0, v3, v4, v1, v2}, Ld;->C(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "android.widget"

    const-string v2, "com.android.internal"

    const-string v3, "android.os.Looper"

    const-string v4, "android.view"

    invoke-static {v0, v3, v4, v1, v2}, Ld;->C(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "com.google.android"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "kotlin"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "kotlinx.coroutines"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/util/List;)Lio/sentry/android/core/anr/a;
    .locals 12

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/core/anr/f;

    iget-object v2, v1, Lio/sentry/android/core/anr/f;->w:[Ljava/lang/StackTraceElement;

    array-length v3, v2

    const/4 v4, 0x2

    if-ge v3, v4, :cond_2

    goto :goto_0

    :cond_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    move v7, v3

    :goto_1
    if-ltz v7, :cond_1

    aget-object v3, v2, v7

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/sentry/android/core/anr/c;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    array-length v3, v2

    sub-int/2addr v3, v7

    int-to-float v5, v4

    int-to-float v3, v3

    div-float v11, v5, v3

    new-instance v3, Lio/sentry/android/core/anr/b;

    array-length v5, v2

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v3, v2, v7, v5}, Lio/sentry/android/core/anr/b;-><init>([Ljava/lang/StackTraceElement;II)V

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/android/core/anr/a;

    if-nez v5, :cond_4

    new-instance v5, Lio/sentry/android/core/anr/a;

    iget-object v6, v1, Lio/sentry/android/core/anr/f;->w:[Ljava/lang/StackTraceElement;

    array-length v8, v6

    add-int/lit8 v8, v8, -0x1

    iget-wide v9, v1, Lio/sentry/android/core/anr/f;->x:J

    invoke-direct/range {v5 .. v11}, Lio/sentry/android/core/anr/a;-><init>([Ljava/lang/StackTraceElement;IIJF)V

    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-wide v8, v1, Lio/sentry/android/core/anr/f;->x:J

    iget-wide v10, v5, Lio/sentry/android/core/anr/a;->g:J

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iput-wide v10, v5, Lio/sentry/android/core/anr/a;->g:J

    iget-wide v10, v5, Lio/sentry/android/core/anr/a;->h:J

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    iput-wide v8, v5, Lio/sentry/android/core/anr/a;->h:J

    iget v3, v5, Lio/sentry/android/core/anr/a;->f:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v5, Lio/sentry/android/core/anr/a;->f:I

    :goto_2
    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_3
    const/4 p0, 0x0

    return-object p0

    :cond_6
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    new-instance v0, Ldb/k0;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/sentry/android/core/anr/a;

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 2

    sget-object v0, Lio/sentry/android/core/anr/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
