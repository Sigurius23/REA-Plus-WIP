.class public final Lp93/j;
.super Lp93/k;
.source "SourceFile"


# static fields
.field public static final c:Lp93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp93/j;

    sget-object v1, Lo93/n;->f:Lva3/e;

    const-string v2, "SuspendFunction"

    invoke-direct {v0, v2, v1}, Lp93/k;-><init>(Ljava/lang/String;Lva3/e;)V

    sput-object v0, Lp93/j;->c:Lp93/j;

    return-void
.end method
