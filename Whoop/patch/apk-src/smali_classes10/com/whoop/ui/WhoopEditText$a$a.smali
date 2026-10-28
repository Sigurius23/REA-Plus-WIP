.class Lcom/whoop/ui/WhoopEditText$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/WhoopEditText$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb5/j;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/whoop/ui/WhoopEditText$a;
    .locals 1

    new-instance v0, Lcom/whoop/ui/WhoopEditText$a;

    invoke-direct {v0, p1, p2}, Lcom/whoop/ui/WhoopEditText$a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public b(I)[Lcom/whoop/ui/WhoopEditText$a;
    .locals 0

    new-array p1, p1, [Lcom/whoop/ui/WhoopEditText$a;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/WhoopEditText$a$a;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/whoop/ui/WhoopEditText$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/ui/WhoopEditText$a$a;->b(I)[Lcom/whoop/ui/WhoopEditText$a;

    move-result-object p1

    return-object p1
.end method
