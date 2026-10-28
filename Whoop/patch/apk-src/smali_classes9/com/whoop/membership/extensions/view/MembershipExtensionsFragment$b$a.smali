.class final Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b$a;->w:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lhw1/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhw1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b$a;->w:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lhw1/b;->a(Lhw1/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhw1/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b$a;->b(Lhw1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
