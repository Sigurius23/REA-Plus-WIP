.class public abstract Lka3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lva3/e;

    const-string v1, "java.lang.Class"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lka3/d;->a:Lva3/e;

    return-void
.end method

.method public static final synthetic a()Lva3/e;
    .locals 1

    sget-object v0, Lka3/d;->a:Lva3/e;

    return-object v0
.end method
