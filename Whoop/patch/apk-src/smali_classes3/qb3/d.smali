.class public final Lqb3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr93/x0;

.field public final b:Llb3/y;

.field public final c:Llb3/y;


# direct methods
.method public constructor <init>(Lr93/x0;Llb3/y;Llb3/y;)V
    .locals 1

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inProjection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outProjection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqb3/d;->a:Lr93/x0;

    iput-object p2, p0, Lqb3/d;->b:Llb3/y;

    iput-object p3, p0, Lqb3/d;->c:Llb3/y;

    return-void
.end method
