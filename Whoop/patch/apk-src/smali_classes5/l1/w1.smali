.class public abstract Ll1/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/m;

.field public static final b:Ly2/y1;

.field public static final c:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly2/m;

    sget-object v1, Ll1/v1;->w:Ll1/v1;

    invoke-direct {v0, v1}, Ly2/a;-><init>(Lc93/m;)V

    sput-object v0, Ll1/w1;->a:Ly2/m;

    new-instance v0, Ly2/y1;

    sget-object v1, Ll1/u1;->w:Ll1/u1;

    invoke-direct {v0, v1}, Ly2/a;-><init>(Lc93/m;)V

    sput-object v0, Ll1/w1;->b:Ly2/y1;

    new-instance v0, Ll1/f0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance v0, Ll1/f0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ll1/w1;->c:Lp1/u2;

    return-void
.end method
