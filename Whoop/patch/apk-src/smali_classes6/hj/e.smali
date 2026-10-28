.class public final synthetic Lhj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lhj/e;->w:I

    iput-object p1, p0, Lhj/e;->x:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Lhj/e;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lhj/e;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$identifier"

    iget-object v1, p0, Lhj/e;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhj/e;->x:Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v2, "\' }\n                            }\n                        });\n\n                        console.log(\'Published click event for identifier: "

    const-string v3, "\');\n                    "

    const-string v4, "\n                        // Publish a \"click\" event (not \"tap\")\n                        window.engagement._.messageBus.publish(\'click\', {\n                            event: {\n                                type: \'click\',\n                                target: { identifier: \'"

    invoke-static {v4, v1, v2, v1, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhj/e;->x:Lcom/amplitude/android/engagement/a;

    iget-object v1, v0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v2, "globalThis.locationActions.setLocation("

    const/16 v3, 0x29

    iget-object v4, p0, Lhj/e;->y:Ljava/lang/String;

    invoke-static {v3, v2, v4}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lhj/m;->y:Lhj/m;

    invoke-virtual {v1, v2, v3}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmj/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v3, "Repositioning Nudges"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    iget-object v1, v1, Lmj/p;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
