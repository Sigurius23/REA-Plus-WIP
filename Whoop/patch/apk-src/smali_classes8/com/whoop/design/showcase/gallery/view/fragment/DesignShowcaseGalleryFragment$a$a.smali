.class final Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a$a;->w:Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lid1/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lid1/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a$a;->w:Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;

    invoke-static {p2}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;->A(Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;)Lyc1/a;

    move-result-object p2

    iget-object p2, p2, Lyc1/a;->b:Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;

    invoke-virtual {p2, p1}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->setViewState(Lid1/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lid1/e;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment$a$a;->b(Lid1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
