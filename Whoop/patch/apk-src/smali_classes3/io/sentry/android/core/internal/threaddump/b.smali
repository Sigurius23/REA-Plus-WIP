.class public final Lio/sentry/android/core/internal/threaddump/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lio/sentry/q6;

.field public final b:Z

.field public final c:Laj/d;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->f:Ljava/util/regex/Pattern;

    const-string v0, "\"(.*)\" (.*) ?sysTid=(\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->g:Ljava/util/regex/Pattern;

    const-string v0, " *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->h:Ljava/util/regex/Pattern;

    const-string v0, " *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->i:Ljava/util/regex/Pattern;

    const-string v0, " *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->j:Ljava/util/regex/Pattern;

    const-string v0, " *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->k:Ljava/util/regex/Pattern;

    const-string v0, " *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->l:Ljava/util/regex/Pattern;

    const-string v0, " *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->m:Ljava/util/regex/Pattern;

    const-string v0, " *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->n:Ljava/util/regex/Pattern;

    const-string v0, " *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->o:Ljava/util/regex/Pattern;

    const-string v0, " *- waiting to lock an unknown object"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->p:Ljava/util/regex/Pattern;

    const-string v0, "\\s+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->q:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->a:Lio/sentry/q6;

    iput-boolean p2, p0, Lio/sentry/android/core/internal/threaddump/b;->b:Z

    new-instance p2, Laj/d;

    invoke-direct {p2, p1}, Laj/d;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/android/core/internal/threaddump/b;->c:Laj/d;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->d:Ljava/util/HashMap;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/protocol/c0;->J:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    iget-object v1, p1, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/o5;

    if-eqz v1, :cond_1

    iget v2, v1, Lio/sentry/o5;->w:I

    iget p1, p1, Lio/sentry/o5;->w:I

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v1, Lio/sentry/o5;->w:I

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lio/sentry/o5;->x:Ljava/lang/String;

    new-instance v2, Lio/sentry/o5;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget v3, p1, Lio/sentry/o5;->w:I

    iput v3, v2, Lio/sentry/o5;->w:I

    iput-object v1, v2, Lio/sentry/o5;->x:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/o5;->y:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/o5;->y:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/o5;->z:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/o5;->z:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/o5;->E:Ljava/lang/Long;

    iput-object v3, v2, Lio/sentry/o5;->E:Ljava/lang/Long;

    iget-object p1, p1, Lio/sentry/o5;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, v2, Lio/sentry/o5;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iput-object v0, p0, Lio/sentry/protocol/c0;->J:Ljava/util/Map;

    return-void
.end method

.method public static c(Ljava/util/regex/Matcher;I)Ljava/lang/Long;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/android/core/internal/threaddump/b;->d:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final f(Lcom/google/android/material/datepicker/n;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v1, Lcom/google/android/material/datepicker/n;->x:I

    sget-object v3, Lio/sentry/android/core/internal/threaddump/b;->f:Ljava/util/regex/Pattern;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    sget-object v6, Lio/sentry/android/core/internal/threaddump/b;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    :goto_0
    iget v8, v1, Lcom/google/android/material/datepicker/n;->y:I

    if-ge v8, v2, :cond_25

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/n;->t()Lio/sentry/android/core/internal/threaddump/a;

    move-result-object v8

    const/4 v9, 0x0

    const-string v10, "Internal error while parsing thread dump."

    iget-object v11, v0, Lio/sentry/android/core/internal/threaddump/b;->a:Lio/sentry/q6;

    if-nez v8, :cond_0

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v3, v9, [Ljava/lang/Object;

    invoke-interface {v1, v2, v10, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v8, v8, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    invoke-static {v5, v8}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-static {v7, v8}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v30, v2

    move-object/from16 v20, v3

    move-object/from16 v27, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    goto/16 :goto_14

    :cond_2
    :goto_1
    iget v8, v1, Lcom/google/android/material/datepicker/n;->y:I

    const/4 v12, 0x1

    sub-int/2addr v8, v12

    iput v8, v1, Lcom/google/android/material/datepicker/n;->y:I

    new-instance v8, Lio/sentry/protocol/c0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v14

    iget v15, v1, Lcom/google/android/material/datepicker/n;->y:I

    const/16 v16, 0x0

    if-ge v15, v2, :cond_3

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/n;->t()Lio/sentry/android/core/internal/threaddump/a;

    move-result-object v15

    if-nez v15, :cond_4

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v11, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-array v9, v9, [Ljava/lang/Object;

    invoke-interface {v8, v11, v10, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    move/from16 v30, v2

    move-object/from16 v20, v3

    move-object/from16 v27, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    move-object/from16 v8, v16

    goto/16 :goto_13

    :cond_4
    iget-object v15, v15, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    invoke-static {v13, v15}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v17

    const-string v12, "No thread id in the dump, skipping thread."

    const/4 v9, 0x4

    if-eqz v17, :cond_7

    invoke-static {v13, v9}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    move-result-object v14

    if-nez v14, :cond_5

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v9, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Object;

    invoke-interface {v8, v9, v12, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iput-object v14, v8, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v8, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    const/4 v12, 0x5

    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_9

    const-string v12, " "

    invoke-virtual {v13, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x20

    invoke-virtual {v13, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    const/4 v14, 0x0

    invoke-virtual {v13, v14, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v8, Lio/sentry/protocol/c0;->z:Ljava/lang/String;

    goto :goto_3

    :cond_6
    iput-object v13, v8, Lio/sentry/protocol/c0;->z:Ljava/lang/String;

    goto :goto_3

    :cond_7
    invoke-static {v14, v15}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/4 v13, 0x3

    invoke-static {v14, v13}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    move-result-object v15

    if-nez v15, :cond_8

    invoke-virtual {v11}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v9, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v14, 0x0

    new-array v10, v14, [Ljava/lang/Object;

    invoke-interface {v8, v9, v12, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    iput-object v15, v8, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    const/4 v12, 0x1

    invoke-virtual {v14, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v8, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    :cond_9
    :goto_3
    iget-object v12, v8, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    if-eqz v12, :cond_b

    const-string v13, "main"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iput-object v13, v8, Lio/sentry/protocol/c0;->H:Ljava/lang/Boolean;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iput-object v13, v8, Lio/sentry/protocol/c0;->E:Ljava/lang/Boolean;

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lio/sentry/android/core/internal/threaddump/b;->b:Z

    if-nez v12, :cond_a

    const/4 v12, 0x1

    goto :goto_4

    :cond_a
    const/4 v12, 0x0

    :goto_4
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    iput-object v12, v8, Lio/sentry/protocol/c0;->F:Ljava/lang/Boolean;

    :cond_b
    iget-object v12, v0, Lio/sentry/android/core/internal/threaddump/b;->c:Laj/d;

    iget-object v12, v12, Laj/d;->w:Ljava/lang/Object;

    check-cast v12, Lio/sentry/q6;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    sget-object v14, Lio/sentry/android/core/internal/threaddump/b;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v14, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v14

    sget-object v15, Lio/sentry/android/core/internal/threaddump/b;->i:Ljava/util/regex/Pattern;

    invoke-virtual {v15, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v15

    sget-object v9, Lio/sentry/android/core/internal/threaddump/b;->j:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    move-object/from16 v20, v3

    sget-object v3, Lio/sentry/android/core/internal/threaddump/b;->k:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    move-object/from16 v21, v5

    sget-object v5, Lio/sentry/android/core/internal/threaddump/b;->m:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    move-object/from16 v22, v6

    sget-object v6, Lio/sentry/android/core/internal/threaddump/b;->l:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    move-object/from16 v23, v7

    sget-object v7, Lio/sentry/android/core/internal/threaddump/b;->o:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    move-object/from16 v24, v11

    sget-object v11, Lio/sentry/android/core/internal/threaddump/b;->n:Ljava/util/regex/Pattern;

    invoke-virtual {v11, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    move-object/from16 v25, v12

    sget-object v12, Lio/sentry/android/core/internal/threaddump/b;->p:Ljava/util/regex/Pattern;

    invoke-virtual {v12, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    move-object/from16 v26, v12

    sget-object v12, Lio/sentry/android/core/internal/threaddump/b;->q:Ljava/util/regex/Pattern;

    invoke-virtual {v12, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    move-object/from16 v27, v4

    move-object/from16 v28, v12

    move-object/from16 v4, v16

    :goto_5
    iget v12, v1, Lcom/google/android/material/datepicker/n;->y:I

    if-ge v12, v2, :cond_c

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/n;->t()Lio/sentry/android/core/internal/threaddump/a;

    move-result-object v12

    if-nez v12, :cond_d

    invoke-virtual/range {v24 .. v24}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v3, v4, v10, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_c
    move/from16 v30, v2

    goto/16 :goto_12

    :cond_d
    const/16 v19, 0x0

    iget-object v12, v12, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    invoke-static {v15, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v29

    const-string v1, "."

    move/from16 v30, v2

    const/4 v2, 0x2

    if-eqz v29, :cond_11

    new-instance v4, Lio/sentry/protocol/z;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    move-object/from16 v29, v10

    const/4 v12, 0x1

    invoke-virtual {v15, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v1, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v15, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v4, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {v15, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v4, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    const/4 v10, 0x5

    invoke-virtual {v15, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    if-ltz v2, :cond_f

    goto :goto_7

    :cond_f
    :goto_6
    move-object/from16 v12, v16

    :goto_7
    iput-object v12, v4, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getInAppIncludes()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getInAppExcludes()Ljava/util/List;

    move-result-object v12

    invoke-static {v1, v2, v12}, Laj/d;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v4, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v15

    :cond_10
    :goto_8
    move-object/from16 v0, v26

    move-object/from16 v10, v28

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/4 v15, 0x4

    goto/16 :goto_11

    :cond_11
    move-object/from16 v29, v10

    const/4 v10, 0x5

    invoke-static {v14, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v18

    const/16 v10, 0x8

    if-eqz v18, :cond_17

    new-instance v1, Lio/sentry/protocol/z;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x3

    invoke-virtual {v14, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v1, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    const/4 v4, 0x6

    invoke-virtual {v14, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    const/4 v4, 0x7

    invoke-virtual {v14, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_12

    goto :goto_9

    :cond_12
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_a

    :cond_13
    :goto_9
    move-object/from16 v4, v16

    :goto_a
    iput-object v4, v1, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v12, "0x"

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    const-string v2, "native"

    iput-object v2, v1, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    invoke-virtual {v14, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_14

    move-object/from16 v4, v16

    goto :goto_b

    :cond_14
    invoke-static {v2}, Luf/c0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_b
    if-eqz v4, :cond_16

    iget-object v10, v0, Lio/sentry/android/core/internal/threaddump/b;->d:Ljava/util/HashMap;

    invoke-virtual {v10, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_15

    new-instance v12, Lio/sentry/protocol/DebugImage;

    invoke-direct {v12}, Lio/sentry/protocol/DebugImage;-><init>()V

    invoke-virtual {v12, v4}, Lio/sentry/protocol/DebugImage;->setDebugId(Ljava/lang/String;)V

    move-object/from16 v18, v15

    const-string v15, "elf"

    invoke-virtual {v12, v15}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    const/4 v15, 0x4

    invoke-virtual {v14, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lio/sentry/protocol/DebugImage;->setCodeFile(Ljava/lang/String;)V

    invoke-virtual {v12, v2}, Lio/sentry/protocol/DebugImage;->setCodeId(Ljava/lang/String;)V

    invoke-virtual {v10, v4, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_15
    move-object/from16 v18, v15

    :goto_c
    const-string v0, "rel:"

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    goto :goto_d

    :cond_16
    move-object/from16 v18, v15

    :goto_d
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, v16

    goto/16 :goto_8

    :cond_17
    move-object/from16 v18, v15

    invoke-static {v9, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v4, Lio/sentry/protocol/z;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v12, 0x1

    invoke-virtual {v9, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v9, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getInAppIncludes()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getInAppExcludes()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Laj/d;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, v4, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_18
    invoke-static {v3, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    if-eqz v4, :cond_10

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v12, 0x1

    iput v12, v0, Lio/sentry/o5;->w:I

    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    iput-object v0, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v0}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    goto/16 :goto_8

    :cond_19
    invoke-static {v5, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    if-eqz v4, :cond_10

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v2, v0, Lio/sentry/o5;->w:I

    const/4 v12, 0x1

    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v5, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    iput-object v0, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v0}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    goto/16 :goto_8

    :cond_1a
    invoke-static {v6, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    if-eqz v4, :cond_10

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x4

    iput v15, v0, Lio/sentry/o5;->w:I

    const/4 v12, 0x1

    invoke-virtual {v6, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v6, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    iput-object v0, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v0}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    goto/16 :goto_8

    :cond_1b
    invoke-static {v7, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    if-eqz v4, :cond_1c

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v10, v0, Lio/sentry/o5;->w:I

    const/4 v12, 0x1

    invoke-virtual {v7, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    const/4 v15, 0x4

    invoke-static {v7, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/o5;->E:Ljava/lang/Long;

    iput-object v0, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v0}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    :goto_e
    move-object/from16 v0, v26

    move-object/from16 v10, v28

    const/4 v1, 0x1

    const/4 v2, 0x3

    goto :goto_11

    :cond_1c
    const/4 v15, 0x4

    goto :goto_e

    :cond_1d
    const/4 v15, 0x4

    invoke-static {v11, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    if-eqz v4, :cond_1f

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v10, v0, Lio/sentry/o5;->w:I

    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v11, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    iput-object v0, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v0}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    :goto_f
    move-object/from16 v0, v26

    :cond_1e
    :goto_10
    move-object/from16 v10, v28

    goto :goto_11

    :cond_1f
    const/4 v1, 0x1

    const/4 v2, 0x3

    goto :goto_f

    :cond_20
    move-object/from16 v0, v26

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-static {v0, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_21

    if-eqz v4, :cond_1e

    new-instance v12, Lio/sentry/o5;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iput v10, v12, Lio/sentry/o5;->w:I

    iput-object v12, v4, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v8, v12}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/c0;Lio/sentry/o5;)V

    goto :goto_10

    :cond_21
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_23

    move-object/from16 v10, v28

    invoke-static {v10, v12}, Lio/sentry/android/core/internal/threaddump/b;->e(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_22

    goto :goto_12

    :cond_22
    :goto_11
    move-object/from16 v1, p1

    move-object/from16 v26, v0

    move-object/from16 v28, v10

    move-object/from16 v15, v18

    move-object/from16 v10, v29

    move/from16 v2, v30

    move-object/from16 v0, p0

    goto/16 :goto_5

    :cond_23
    :goto_12
    invoke-static {v13}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v0, Lio/sentry/protocol/b0;

    invoke-direct {v0, v13}, Lio/sentry/protocol/b0;-><init>(Ljava/util/List;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lio/sentry/protocol/b0;->y:Ljava/lang/Boolean;

    iput-object v0, v8, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    :goto_13
    move-object/from16 v0, p0

    if-eqz v8, :cond_24

    iget-object v1, v0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    :goto_14
    move-object/from16 v1, p1

    move-object/from16 v3, v20

    move-object/from16 v5, v21

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v4, v27

    move/from16 v2, v30

    goto/16 :goto_0

    :cond_25
    return-void
.end method
