.class public final Lq1/a;
.super Ldt/b;
.source "SourceFile"


# instance fields
.field public final a:Lq1/l0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq1/l0;

    invoke-direct {v0}, Lq1/l0;-><init>()V

    iput-object v0, p0, Lq1/a;->a:Lq1/l0;

    return-void
.end method


# virtual methods
.method public final c0(Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 1

    iget-object v0, p0, Lq1/a;->a:Lq1/l0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lq1/l0;->d0(Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V

    return-void
.end method
