.class public final Lq0/b;
.super Lq0/y;
.source "SourceFile"


# static fields
.field public static final K:Lp0/n0;


# instance fields
.field public final J:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp0/w0;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lp0/w0;-><init>(I)V

    new-instance v1, Lpt2/k;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lpt2/k;-><init>(I)V

    invoke-static {v0, v1}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object v0

    sput-object v0, Lq0/b;->K:Lp0/n0;

    return-void
.end method

.method public constructor <init>(FILc93/a;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Lq0/y;-><init>(IF)V

    invoke-static {p3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lq0/b;->J:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final m()I
    .locals 1

    iget-object v0, p0, Lq0/b;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method
