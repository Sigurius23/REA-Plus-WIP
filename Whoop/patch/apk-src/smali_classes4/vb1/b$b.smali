.class final synthetic Lvb1/b$b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvb1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
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


# static fields
.field public static final w:Lvb1/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvb1/b$b;

    invoke-direct {v0}, Lvb1/b$b;-><init>()V

    sput-object v0, Lvb1/b$b;->w:Lvb1/b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "graphModelToGraphState(Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/design/atomic/organism/graph/state/GraphState;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lvb1/b;

    const-string v3, "graphModelToGraphState"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvb1/b;->t(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {p0, p1}, Lvb1/b$b;->a(Lcom/whoop/design/models/items/graph/GraphModel;)Lj71/c;

    move-result-object p1

    return-object p1
.end method
