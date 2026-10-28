.class final Le52/a$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le52/a;->j(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.store.PuffinStore"
    f = "PuffinStore.kt"
    l = {
        0x30
    }
    m = "updateLastConnectedPuffin"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Le52/a;


# direct methods
.method public constructor <init>(Le52/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le52/a;",
            "Lq83/d<",
            "-",
            "Le52/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le52/a$e;->z:Le52/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le52/a$e;->y:Ljava/lang/Object;

    iget p1, p0, Le52/a$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le52/a$e;->E:I

    iget-object p1, p0, Le52/a$e;->z:Le52/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Le52/a;->f(Le52/a;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
