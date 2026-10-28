.class public final Lg1/n5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/n1;


# instance fields
.field public final a:Lam2/b;

.field public final b:Lp1/k1;

.field public final c:Lg1/y;

.field public final d:Lf0/c1;


# direct methods
.method public constructor <init>(Lam2/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/n5;->a:Lam2/b;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lg1/n5;->b:Lp1/k1;

    new-instance p1, Lg1/y;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lg1/y;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lg1/n5;->c:Lg1/y;

    new-instance p1, Lf0/c1;

    invoke-direct {p1}, Lf0/c1;-><init>()V

    iput-object p1, p0, Lg1/n5;->d:Lf0/c1;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, La1/h;-><init>(Lg1/n5;Lf0/z0;Lc93/m;Lq83/d;)V

    invoke-static {v0, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
