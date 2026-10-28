.class public final synthetic Lcom/whoop/whooplive/selfie/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lcom/whoop/whooplive/selfie/SelfieActivity$h;

.field public final synthetic x:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/d;->w:Lcom/whoop/whooplive/selfie/SelfieActivity$h;

    iput-object p2, p0, Lcom/whoop/whooplive/selfie/d;->x:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/d;->w:Lcom/whoop/whooplive/selfie/SelfieActivity$h;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/d;->x:Landroidx/viewpager/widget/ViewPager;

    invoke-static {v0, v1}, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->b(Lcom/whoop/whooplive/selfie/SelfieActivity$h;Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method
