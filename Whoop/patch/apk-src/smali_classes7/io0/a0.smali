.class public abstract Lio0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\u0007\u001a\u00020\u00042\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;",
        "screens",
        "",
        "",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;",
        "intakeResponsesByScreenId",
        "b",
        "(Ljava/util/List;Ljava/util/Map;)Ljava/lang/String;",
        "screen",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;",
        "d",
        "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Ljava/util/Map;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;",
        "clinician-in-the-loop_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio0/a0;->c(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "screens"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intakeResponsesByScreenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sget-object v1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;->Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput$a;

    invoke-virtual {v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput$a;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;

    invoke-virtual {v3}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->getContent()Lgo0/c;

    move-result-object v4

    instance-of v4, v4, Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;

    if-eqz v4, :cond_1

    invoke-static {v3, p1}, Lio0/a0;->d(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Ljava/util/Map;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lad3/g;->a:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Ljava/util/Map;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;",
            ">;)",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->getContent()Lgo0/c;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    new-instance p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, v2, v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;-><init>(Ljava/util/List;Ljava/lang/String;)V

    :cond_0
    check-cast v0, Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;

    invoke-virtual {v0}, Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;->getTextInput()Lcom/whoop/design/models/items/TextAreaModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->getId()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;->getSelectedOptionIds()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-direct {v0, p0, v2}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;-><init>(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
