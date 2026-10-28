.class final synthetic Lui0/n$d$a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/n$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public static final w:Lui0/n$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui0/n$d$a;

    invoke-direct {v0}, Lui0/n$d$a;-><init>()V

    sput-object v0, Lui0/n$d$a;->w:Lui0/n$d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lcom/whoop/design/models/modal/AnyModal;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lri0/b$t;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/design/models/modal/AnyModal;)Lri0/b$t;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lri0/b$t;

    invoke-direct {v0, p1}, Lri0/b$t;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {p0, p1}, Lui0/n$d$a;->a(Lcom/whoop/design/models/modal/AnyModal;)Lri0/b$t;

    move-result-object p1

    return-object p1
.end method
