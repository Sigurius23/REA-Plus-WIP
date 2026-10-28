.class public abstract Lq93/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/h;

.field public static final b:Lva3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "getFirst"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lq93/q;->a:Lva3/h;

    const-string v0, "getLast"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lq93/q;->b:Lva3/h;

    return-void
.end method

.method public static final synthetic a()Lva3/h;
    .locals 1

    sget-object v0, Lq93/q;->a:Lva3/h;

    return-object v0
.end method

.method public static final synthetic b()Lva3/h;
    .locals 1

    sget-object v0, Lq93/q;->b:Lva3/h;

    return-object v0
.end method
