.class public final Lp93/h;
.super Lp93/k;
.source "SourceFile"


# static fields
.field public static final c:Lp93/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp93/h;

    sget-object v1, Lo93/n;->i:Lva3/e;

    const-string v2, "KFunction"

    invoke-direct {v0, v2, v1}, Lp93/k;-><init>(Ljava/lang/String;Lva3/e;)V

    sput-object v0, Lp93/h;->c:Lp93/h;

    return-void
.end method
