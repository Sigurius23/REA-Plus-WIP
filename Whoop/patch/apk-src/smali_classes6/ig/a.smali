.class public final Lig/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/d;


# static fields
.field public static final a:Lig/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lig/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lig/a;->a:Lig/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lig/a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x403d7566

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "FormUrlCollectionName(member=member)"

    return-object v0
.end method
