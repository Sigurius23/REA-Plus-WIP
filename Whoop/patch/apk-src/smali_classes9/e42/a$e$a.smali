.class public final Le42/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le42/a$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Le42/a$e$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Le42/a$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le42/a$e$a$a;

    iget v1, v0, Le42/a$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le42/a$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Le42/a$e$a$a;

    invoke-direct {v0, p0, p2}, Le42/a$e$a$a;-><init>(Le42/a$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Le42/a$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le42/a$e$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le42/a$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Le42/a$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Le42/a$e$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Le42/a$e$a;->w:Lec3/m;

    check-cast p1, Lz32/b;

    instance-of v2, p1, Lz32/b$a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    new-instance p1, Lcom/whoop/pregnancy/view/a$c;

    const-string v2, "ONBOARDING_WELCOME"

    invoke-direct {p1, v2, v5, v4, v6}, Lcom/whoop/pregnancy/view/a$c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lz32/b$b;

    if-eqz v2, :cond_4

    new-instance p1, Lcom/whoop/pregnancy/view/a$c;

    const-string v2, "SETTINGS_EXIT"

    invoke-direct {p1, v2, v5, v4, v6}, Lcom/whoop/pregnancy/view/a$c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lz32/b$d;

    if-eqz v2, :cond_5

    new-instance p1, Lcom/whoop/pregnancy/view/a$c;

    const-string v2, "ONBOARDING_SAVED"

    invoke-direct {p1, v2, v5, v4, v6}, Lcom/whoop/pregnancy/view/a$c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lz32/b$f;

    if-eqz v2, :cond_7

    sget-object p1, Lcom/whoop/pregnancy/view/a$g;->a:Lcom/whoop/pregnancy/view/a$g;

    :goto_1
    iput-object v6, v0, Le42/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Le42/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Le42/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Le42/a$e$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Le42/a$e$a$a;->H:I

    iput v3, v0, Le42/a$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot navigate from domain state "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
