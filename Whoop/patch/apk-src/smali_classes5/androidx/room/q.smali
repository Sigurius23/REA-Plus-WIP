.class public interface abstract Landroidx/room/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# static fields
.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "androidx$room$IMultiInstanceInvalidationService"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/room/q;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract H(Landroidx/room/o;Ljava/lang/String;)I
.end method

.method public abstract f0(Landroidx/room/o;I)V
.end method

.method public abstract y(I[Ljava/lang/String;)V
.end method
