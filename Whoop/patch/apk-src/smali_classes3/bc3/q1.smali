.class public final Lbc3/q1;
.super Lbc3/m1;
.source "SourceFile"


# instance fields
.field public final E:Llc3/g;

.field public final synthetic F:Lbc3/t1;


# direct methods
.method public constructor <init>(Lbc3/t1;Llc3/g;)V
    .locals 0

    iput-object p1, p0, Lbc3/q1;->F:Lbc3/t1;

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p2, p0, Lbc3/q1;->E:Llc3/g;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    iget-object v0, p0, Lbc3/q1;->E:Llc3/g;

    check-cast v0, Llc3/f;

    iget-object v1, p0, Lbc3/q1;->F:Lbc3/t1;

    invoke-virtual {v0, v1, p1}, Llc3/f;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    return-void
.end method
