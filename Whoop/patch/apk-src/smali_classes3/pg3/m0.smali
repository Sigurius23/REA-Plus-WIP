.class public final Lpg3/m0;
.super Lpg3/e1;
.source "SourceFile"


# static fields
.field public static final c:Lpg3/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpg3/m0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lpg3/m0;->c:Lpg3/m0;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lud3/i0;

    if-eqz p2, :cond_0

    iget-object p1, p1, Lpg3/s0;->i:Lq30/w0;

    invoke-virtual {p1, p2}, Lq30/w0;->f(Lud3/i0;)V

    :cond_0
    return-void
.end method
