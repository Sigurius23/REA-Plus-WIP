.class public abstract Li3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Li3/y;

.field public static final B:Li3/y;

.field public static final C:Li3/y;

.field public static final D:Li3/y;

.field public static final E:Li3/y;

.field public static final F:Li3/y;

.field public static final G:Li3/y;

.field public static final H:Li3/y;

.field public static final I:Li3/y;

.field public static final J:Li3/y;

.field public static final K:Li3/y;

.field public static final L:Li3/y;

.field public static final M:Li3/y;

.field public static final N:Li3/y;

.field public static final O:Li3/y;

.field public static final a:Li3/y;

.field public static final b:Li3/y;

.field public static final c:Li3/y;

.field public static final d:Li3/y;

.field public static final e:Li3/y;

.field public static final f:Li3/y;

.field public static final g:Li3/y;

.field public static final h:Li3/y;

.field public static final i:Li3/y;

.field public static final j:Li3/y;

.field public static final k:Li3/y;

.field public static final l:Li3/y;

.field public static final m:Li3/y;

.field public static final n:Li3/y;

.field public static final o:Li3/y;

.field public static final p:Li3/y;

.field public static final q:Li3/y;

.field public static final r:Li3/y;

.field public static final s:Li3/y;

.field public static final t:Li3/y;

.field public static final u:Li3/y;

.field public static final v:Li3/y;

.field public static final w:Li3/y;

.field public static final x:Li3/y;

.field public static final y:Li3/y;

.field public static final z:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Li3/t;->y:Li3/t;

    new-instance v1, Li3/y;

    const-string v2, "ContentDescription"

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->a:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "StateDescription"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->b:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "ProgressBarRangeInfo"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->c:Li3/y;

    sget-object v0, Li3/t;->J:Li3/t;

    new-instance v1, Li3/y;

    const-string v4, "PaneTitle"

    invoke-direct {v1, v0, v4, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->d:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "SelectableGroup"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->e:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "CollectionInfo"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->f:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "CollectionItemInfo"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->g:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Heading"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->h:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Disabled"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->i:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "LiveRegion"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->j:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Focused"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->k:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IsContainer"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->l:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IsTraversalGroup"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->m:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IsSensitiveData"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->n:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "InvisibleToUser"

    sget-object v4, Li3/t;->F:Li3/t;

    invoke-direct {v0, v1, v4}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Li3/u;->o:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "HideFromAccessibility"

    sget-object v4, Li3/t;->E:Li3/t;

    invoke-direct {v0, v1, v4}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Li3/u;->p:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "ContentType"

    sget-object v4, Li3/t;->z:Li3/t;

    invoke-direct {v0, v1, v4}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Li3/u;->q:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "ContentDataType"

    sget-object v4, Li3/t;->x:Li3/t;

    invoke-direct {v0, v1, v4}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Li3/u;->r:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "TraversalIndex"

    sget-object v4, Li3/t;->O:Li3/t;

    invoke-direct {v0, v1, v4}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Li3/u;->s:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "HorizontalScrollAxisRange"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->t:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "VerticalScrollAxisRange"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->u:Li3/y;

    sget-object v0, Li3/t;->H:Li3/t;

    new-instance v1, Li3/y;

    const-string v4, "IsPopup"

    invoke-direct {v1, v0, v4, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->v:Li3/y;

    sget-object v0, Li3/t;->G:Li3/t;

    new-instance v1, Li3/y;

    const-string v4, "IsDialog"

    invoke-direct {v1, v0, v4, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->w:Li3/y;

    sget-object v0, Li3/t;->K:Li3/t;

    new-instance v1, Li3/y;

    const-string v4, "Role"

    invoke-direct {v1, v0, v4, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->x:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "TestTag"

    sget-object v4, Li3/t;->M:Li3/t;

    invoke-direct {v0, v4, v1, v2}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v0, Li3/u;->y:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "LinkTestMarker"

    sget-object v4, Li3/t;->I:Li3/t;

    invoke-direct {v0, v4, v1, v2}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v0, Li3/u;->z:Li3/y;

    sget-object v0, Li3/t;->N:Li3/t;

    new-instance v1, Li3/y;

    const-string v4, "Text"

    invoke-direct {v1, v0, v4, v3}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v1, Li3/u;->A:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "TextSubstitution"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->B:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IsShowingTextSubstitution"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->C:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "InputText"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->D:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "EditableText"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->E:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "TextSelectionRange"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->F:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "ImeAction"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->G:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Selected"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->H:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "ToggleableState"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->I:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Password"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->J:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Error"

    invoke-direct {v0, v1, v2}, Li3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li3/u;->K:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IndexForKey"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->L:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "IsEditable"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->M:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "MaxTextLength"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Li3/u;->N:Li3/y;

    new-instance v0, Li3/y;

    const-string v1, "Shape"

    sget-object v3, Li3/t;->L:Li3/t;

    invoke-direct {v0, v3, v1, v2}, Li3/y;-><init>(Lc93/m;Ljava/lang/String;Z)V

    sput-object v0, Li3/u;->O:Li3/y;

    return-void
.end method
