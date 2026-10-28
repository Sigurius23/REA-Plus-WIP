.class public final synthetic Ley/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ley/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ley/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->B(Ljava/util/Set;)V

    return-void

    :pswitch_0
    check-cast p1, Lfy/d;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
