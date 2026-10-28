.class public final Lio/sentry/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/reflect/Field;

.field public final b:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/sentry/v0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "androidx.compose.ui.platform.TestTagElement"

    invoke-static {p1, v0}, Lg73/a;->r(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/compose/a;->a:Ljava/lang/reflect/Field;

    const-string v0, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement"

    invoke-static {p1, v0}, Lg73/a;->r(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/compose/a;->b:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;)Ljava/lang/String;
    .locals 3

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    const-string v1, "androidx.compose.ui.platform.TestTagElement"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/compose/a;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v1, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/compose/a;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_1
    instance-of v0, p1, Li3/m;

    if-eqz v0, :cond_4

    check-cast p1, Li3/m;

    invoke-interface {p1}, Li3/m;->i()Li3/l;

    move-result-object p1

    invoke-virtual {p1}, Li3/l;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/y;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v1, Li3/y;->a:Ljava/lang/String;

    const-string v2, "SentryTag"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "TestTag"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method
