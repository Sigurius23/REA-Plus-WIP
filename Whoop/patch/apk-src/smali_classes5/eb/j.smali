.class public abstract Leb/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Class;

.field public static final b:La0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Landroid/os/Bundle;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Leb/j;->a:[Ljava/lang/Class;

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    sput-object v0, Leb/j;->b:La0/g;

    return-void
.end method
