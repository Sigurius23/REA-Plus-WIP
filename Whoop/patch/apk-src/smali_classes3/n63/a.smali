.class public final Ln63/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ln63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln63/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Ln63/a;->w:Ln63/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->a:Z

    iput-boolean v0, p1, Lad3/g;->d:Z

    iput-boolean v0, p1, Lad3/g;->m:Z

    iput-boolean v0, p1, Lad3/g;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p1, Lad3/g;->e:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
