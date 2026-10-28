.class public abstract Lpc3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpc3/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpc3/r;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lpc3/u;->a:Ll83/p;

    return-void
.end method
