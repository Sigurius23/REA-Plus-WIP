.class public final Lrj/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lcom/amplitude/android/engagement/types/SurveyListBlock;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:I

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lrj/p;


# direct methods
.method public constructor <init>(Ljava/util/List;ILjava/util/List;Lrj/p;Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;)V
    .locals 0

    iput-object p1, p0, Lrj/b;->w:Ljava/util/List;

    iput p2, p0, Lrj/b;->x:I

    iput-object p3, p0, Lrj/b;->y:Ljava/util/List;

    iput-object p4, p0, Lrj/b;->z:Lrj/p;

    iput-object p5, p0, Lrj/b;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lrj/b;->F:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v0, p0, Lrj/b;->x:I

    iget-object v1, p0, Lrj/b;->w:Ljava/util/List;

    if-eqz p1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lrj/b;->z:Lrj/p;

    iget-object v1, p0, Lrj/b;->y:Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast v1, Ljava/util/Collection;

    iget-object p1, v0, Lrj/p;->a:Ljava/lang/String;

    invoke-static {p1, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_2
    move-object v4, p1

    goto :goto_3

    :cond_1
    check-cast v1, Ljava/lang/Iterable;

    iget-object p1, v0, Lrj/p;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_2

    :goto_3
    new-instance v1, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;

    iget-object p1, p0, Lrj/b;->F:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lrj/b;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
