.class public final synthetic Lb41/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb41/e;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb41/e;->x:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb41/e;->x:Lcom/whoop/navigation/models/GenericInteraction;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lb41/e;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lb41/d$c;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
