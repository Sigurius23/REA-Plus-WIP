.class public final Lnb3/d;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lnb3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnb3/d;->w:Lnb3/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnb3/e;->w:Lnb3/e;

    sget-object v0, Lo93/e;->f:Ll83/p;

    invoke-static {}, Lce/w;->M()Lo93/e;

    move-result-object v0

    return-object v0
.end method
