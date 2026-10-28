.class public final Landroidx/room/m0;
.super Landroidx/room/q0;
.source "SourceFile"


# instance fields
.field public final synthetic a:La1/b;


# direct methods
.method public constructor <init>(La1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/m0;->a:La1/b;

    return-void
.end method


# virtual methods
.method public final onOpen(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/m0;->a:La1/b;

    invoke-virtual {v0, p1}, La1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
