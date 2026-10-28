.class public final Lp93/i;
.super Lp93/k;
.source "SourceFile"


# static fields
.field public static final c:Lp93/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp93/i;

    sget-object v1, Lo93/n;->i:Lva3/e;

    const-string v2, "KSuspendFunction"

    invoke-direct {v0, v2, v1}, Lp93/k;-><init>(Ljava/lang/String;Lva3/e;)V

    sput-object v0, Lp93/i;->c:Lp93/i;

    return-void
.end method
