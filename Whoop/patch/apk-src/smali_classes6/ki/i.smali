.class public abstract Lki/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;

.field public static final b:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkg2/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkg2/d;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lki/i;->a:Ll83/p;

    new-instance v0, Lkg2/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lkg2/d;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lki/i;->b:Ll83/p;

    return-void
.end method
