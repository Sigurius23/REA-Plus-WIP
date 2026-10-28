.class public final synthetic Lbs2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljo/m;
.implements Lax/c;


# instance fields
.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lbs2/e;->w:Lc93/a;

    iput-object p2, p0, Lbs2/e;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Lbs2/e;->w:Lc93/a;

    iget-object v1, p0, Lbs2/e;->x:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->d(Lc93/a;Lc93/a;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
