.class public abstract Lhb3/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.suspend"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhb3/d0;->a:Lva3/e;

    new-instance v0, Lva3/a;

    sget-object v1, Lo93/n;->k:Lva3/e;

    const-string v2, "suspend"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lva3/a;-><init>(Lva3/e;Lva3/h;)V

    return-void
.end method
