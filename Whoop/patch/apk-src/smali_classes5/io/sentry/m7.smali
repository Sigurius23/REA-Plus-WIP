.class public final Lio/sentry/m7;
.super Lio/sentry/e7;
.source "SourceFile"


# static fields
.field public static final S:Lio/sentry/protocol/g0;


# instance fields
.field public P:Ljava/lang/String;

.field public Q:Lio/sentry/protocol/g0;

.field public R:Laa3/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/sentry/protocol/g0;->CUSTOM:Lio/sentry/protocol/g0;

    sput-object v0, Lio/sentry/m7;->S:Lio/sentry/protocol/g0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/sentry/protocol/g0;Ljava/lang/String;Laa3/i1;)V
    .locals 3

    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Lio/sentry/protocol/v;-><init>()V

    new-instance v1, Lio/sentry/h7;

    invoke-direct {v1}, Lio/sentry/h7;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, p3, v2}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    const-string p3, "name is required"

    invoke-static {p1, p3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/m7;->P:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/m7;->Q:Lio/sentry/protocol/g0;

    invoke-virtual {p0, p4}, Lio/sentry/e7;->a(Laa3/i1;)V

    if-nez p4, :cond_0

    move-object p1, v2

    goto :goto_0

    :cond_0
    iget-object p1, p4, Laa3/i1;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    :goto_0
    if-nez p4, :cond_1

    move-object p2, v2

    goto :goto_1

    :cond_1
    iget-object p2, p4, Laa3/i1;->c:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Double;

    :goto_1
    if-nez p4, :cond_2

    move-object p3, v2

    goto :goto_2

    :cond_2
    iget-object p3, p4, Laa3/i1;->d:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Double;

    :goto_2
    invoke-static {v2, p1, p2, p3}, Lwb3/f;->y(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/e7;->M:Lio/sentry/c;

    return-void
.end method

.method public static b(La3/p;)Lio/sentry/m7;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lio/sentry/c;

    iget-object v1, v0, Lio/sentry/c;->c:Ljava/lang/Double;

    new-instance v1, Lio/sentry/m7;

    iget-object v2, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/protocol/v;

    iget-object p0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast p0, Lio/sentry/h7;

    const-string v3, "default"

    const/4 v4, 0x0

    invoke-direct {v1, v2, p0, v3, v4}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    const-string p0, "<unlabeled transaction>"

    iput-object p0, v1, Lio/sentry/m7;->P:Ljava/lang/String;

    iput-object v4, v1, Lio/sentry/m7;->R:Laa3/i1;

    sget-object p0, Lio/sentry/m7;->S:Lio/sentry/protocol/g0;

    iput-object p0, v1, Lio/sentry/m7;->Q:Lio/sentry/protocol/g0;

    invoke-static {v0, v4, v4, v4}, Lwb3/f;->y(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p0

    iput-object p0, v1, Lio/sentry/e7;->M:Lio/sentry/c;

    return-object v1
.end method
