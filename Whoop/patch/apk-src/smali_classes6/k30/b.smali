.class public final Lk30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Landroid/widget/ScrollView;

.field public final b:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

.field public final c:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

.field public final d:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;


# direct methods
.method public constructor <init>(Landroid/widget/ScrollView;Lcom/stripe/android/stripe3ds2/views/BrandZoneView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;Lcom/stripe/android/stripe3ds2/views/InformationZoneView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk30/b;->a:Landroid/widget/ScrollView;

    iput-object p2, p0, Lk30/b;->b:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    iput-object p3, p0, Lk30/b;->c:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    iput-object p4, p0, Lk30/b;->d:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lk30/b;->a:Landroid/widget/ScrollView;

    return-object v0
.end method
