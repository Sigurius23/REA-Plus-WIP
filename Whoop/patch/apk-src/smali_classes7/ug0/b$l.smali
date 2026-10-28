.class final Lug0/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->S(Lec3/m;Ltg0/b;Ltg0/a$c;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ltg0/a$c;

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lug0/b;

.field final synthetic y:Ltg0/b;

.field final synthetic z:Lcom/whoop/ai/chat/models/AIConversation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lug0/b;Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ltg0/a$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lug0/b;",
            "Ltg0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Ltg0/a$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$l;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$l;->x:Lug0/b;

    iput-object p3, p0, Lug0/b$l;->y:Ltg0/b;

    iput-object p4, p0, Lug0/b$l;->z:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p5, p0, Lug0/b$l;->E:Ltg0/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/q;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/q;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lug0/b$l;->w:Lkotlin/jvm/internal/g0;

    iget-object v0, p0, Lug0/b$l;->x:Lug0/b;

    iget-object v1, p0, Lug0/b$l;->y:Ltg0/b;

    iget-object v2, p0, Lug0/b$l;->z:Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v3, p0, Lug0/b$l;->E:Ltg0/a$c;

    invoke-static {v0, p1, v1, v2, v3}, Lug0/b;->B(Lug0/b;Lvg0/q;Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ltg0/a$c;)Ltg0/b;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/q;

    invoke-virtual {p0, p1, p2}, Lug0/b$l;->b(Lvg0/q;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
