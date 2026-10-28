.class public final Lpa3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loa3/p;


# static fields
.field public static final I:Z

.field public static final J:Ljava/util/HashMap;


# instance fields
.field public E:[Ljava/lang/String;

.field public F:[Ljava/lang/String;

.field public G:Lpa3/a;

.field public H:[Ljava/lang/String;

.field public w:[I

.field public x:Ljava/lang/String;

.field public y:I

.field public z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "true"

    const-string v1, "kotlin.ignore.old.metadata"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lpa3/f;->I:Z
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, Lpa3/f;->I:Z

    :goto_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lpa3/f;->J:Ljava/util/HashMap;

    new-instance v1, Lva3/e;

    const-string v2, "kotlin.jvm.internal.KotlinClass"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v2, Lpa3/a;->E:Lpa3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lva3/e;

    const-string v2, "kotlin.jvm.internal.KotlinFileFacade"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v2, Lpa3/a;->F:Lpa3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lva3/e;

    const-string v2, "kotlin.jvm.internal.KotlinMultifileClass"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v2, Lpa3/a;->H:Lpa3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lva3/e;

    const-string v2, "kotlin.jvm.internal.KotlinMultifileClassPart"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v2, Lpa3/a;->I:Lpa3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lva3/e;

    const-string v2, "kotlin.jvm.internal.KotlinSyntheticClass"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    sget-object v2, Lpa3/a;->G:Lpa3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final i(Lva3/c;Lw93/a;)Loa3/n;
    .locals 1

    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object p2

    sget-object v0, Lfa3/x;->a:Lva3/e;

    invoke-virtual {p2, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lbu/c;

    invoke-direct {p1, p0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    sget-object v0, Lfa3/x;->o:Lva3/e;

    invoke-virtual {p2, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lpa3/d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lpa3/d;-><init>(Lpa3/f;I)V

    return-object p1

    :cond_1
    sget-boolean p2, Lpa3/f;->I:Z

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lpa3/f;->G:Lpa3/a;

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    sget-object p2, Lpa3/f;->J:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpa3/a;

    if-eqz p1, :cond_4

    iput-object p1, p0, Lpa3/f;->G:Lpa3/a;

    new-instance p1, Lpa3/d;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lpa3/d;-><init>(Lpa3/f;I)V

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
