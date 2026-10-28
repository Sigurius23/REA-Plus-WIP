.class public final Lp93/g;
.super Lp93/k;
.source "SourceFile"


# static fields
.field public static final c:Lp93/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp93/g;

    sget-object v1, Lo93/n;->k:Lva3/e;

    const-string v2, "Function"

    invoke-direct {v0, v2, v1}, Lp93/k;-><init>(Ljava/lang/String;Lva3/e;)V

    sput-object v0, Lp93/g;->c:Lp93/g;

    return-void
.end method
