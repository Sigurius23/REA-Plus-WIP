.class public Lu92/f;
.super Lu92/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lod1/u;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p3}, Lod1/u;->k()Lxg3/g;

    move-result-object p1

    new-instance p2, Lcom/whoop/data/onboarding/c;

    const/16 p3, 0x18

    invoke-direct {p2, p0, p3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public static synthetic y(Lu92/f;Lod1/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu92/f;->z(Lod1/u$a;)V

    return-void
.end method

.method private synthetic z(Lod1/u$a;)V
    .locals 0

    invoke-virtual {p0}, Lu92/d;->a()V

    return-void
.end method
