.class public abstract Lo52/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo52/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ldq1/a;",
        "currentZone",
        "Lo52/c;",
        "b",
        "(Ldq1/a;)Lo52/c;",
        "realtime-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ldq1/a;)Lo52/c;
    .locals 0

    invoke-static {p0}, Lo52/o;->b(Ldq1/a;)Lo52/c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ldq1/a;)Lo52/c;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lo52/o$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_1
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->s1:I

    sget v1, Lk52/b;->r:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_2
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->r1:I

    sget v1, Lk52/b;->q:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_3
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->q1:I

    sget v1, Lk52/b;->p:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_4
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->p1:I

    sget v1, Lk52/b;->o:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_5
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->o1:I

    sget v1, Lk52/b;->n:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_6
    new-instance p0, Lo52/c;

    sget v0, Lk52/f;->n1:I

    sget v1, Lk52/b;->m:I

    invoke-direct {p0, v0, v1}, Lo52/c;-><init>(II)V

    return-object p0

    :pswitch_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
