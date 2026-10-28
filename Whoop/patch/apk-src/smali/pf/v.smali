.class public final Lpf/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lpf/v;


# instance fields
.field public final a:Lbg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpf/v;

    new-instance v1, Ljc/a;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ljc/a;-><init>(I)V

    invoke-direct {v0, v1}, Lpf/v;-><init>(Ljc/a;)V

    sput-object v0, Lpf/v;->b:Lpf/v;

    return-void
.end method

.method public constructor <init>(Ljc/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ldf/b;->a:Ljf/a;

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    invoke-static {p1, v0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbg/m;

    iput-object p1, p0, Lpf/v;->a:Lbg/m;

    return-void
.end method
