.class public final Lbc/y;
.super Lbc/x;
.source "SourceFile"


# instance fields
.field public final synthetic a:La0/g;

.field public final synthetic b:Lbc/z;


# direct methods
.method public constructor <init>(Lbc/z;La0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/y;->b:Lbc/z;

    iput-object p2, p0, Lbc/y;->a:La0/g;

    return-void
.end method


# virtual methods
.method public final c(Lbc/w;)V
    .locals 2

    iget-object v0, p0, Lbc/y;->b:Lbc/z;

    iget-object v0, v0, Lbc/z;->x:Landroid/view/ViewGroup;

    iget-object v1, p0, Lbc/y;->a:La0/g;

    invoke-virtual {v1, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lbc/w;->C(Lbc/u;)Lbc/w;

    return-void
.end method
