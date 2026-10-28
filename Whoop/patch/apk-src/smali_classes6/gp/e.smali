.class public final Lgp/e;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final w:Lgp/d0;

.field public final x:Lgp/m0;

.field public final y:Lgp/f;

.field public final z:Lgp/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/k0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lgp/d0;Lgp/m0;Lgp/f;Lgp/n0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/e;->w:Lgp/d0;

    iput-object p2, p0, Lgp/e;->x:Lgp/m0;

    iput-object p3, p0, Lgp/e;->y:Lgp/f;

    iput-object p4, p0, Lgp/e;->z:Lgp/n0;

    iput-object p5, p0, Lgp/e;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Lorg/json/JSONObject;
    .locals 5

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, p0, Lgp/e;->y:Lgp/f;

    if-eqz v1, :cond_0

    const-string v2, "credProps"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "rk"

    iget-boolean v1, v1, Lgp/f;->w:Z

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    iget-object v1, p0, Lgp/e;->w:Lgp/d0;

    if-eqz v1, :cond_1

    const-string v2, "uvm"

    invoke-virtual {v1}, Lgp/d0;->b()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v1, p0, Lgp/e;->z:Lgp/n0;

    if-eqz v1, :cond_2

    const-string v2, "prf"

    invoke-virtual {v1}, Lgp/n0;->b()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget-object v1, p0, Lgp/e;->E:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v2, "txAuthSimple"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_3
    return-object v0

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error encoding AuthenticationExtensionsClientOutputs to JSON object"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgp/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgp/e;

    iget-object v0, p0, Lgp/e;->w:Lgp/d0;

    iget-object v2, p1, Lgp/e;->w:Lgp/d0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/e;->x:Lgp/m0;

    iget-object v2, p1, Lgp/e;->x:Lgp/m0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/e;->y:Lgp/f;

    iget-object v2, p1, Lgp/e;->y:Lgp/f;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/e;->z:Lgp/n0;

    iget-object v2, p1, Lgp/e;->z:Lgp/n0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/e;->E:Ljava/lang/String;

    iget-object p1, p1, Lgp/e;->E:Ljava/lang/String;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lgp/e;->z:Lgp/n0;

    iget-object v1, p0, Lgp/e;->E:Ljava/lang/String;

    iget-object v2, p0, Lgp/e;->w:Lgp/d0;

    iget-object v3, p0, Lgp/e;->x:Lgp/m0;

    iget-object v4, p0, Lgp/e;->y:Lgp/f;

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lgp/e;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AuthenticationExtensionsClientOutputs{"

    const-string v2, "}"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lgp/e;->w:Lgp/d0;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x2

    iget-object v2, p0, Lgp/e;->x:Lgp/m0;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lgp/e;->y:Lgp/f;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x4

    iget-object v2, p0, Lgp/e;->z:Lgp/n0;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x5

    iget-object v1, p0, Lgp/e;->E:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
