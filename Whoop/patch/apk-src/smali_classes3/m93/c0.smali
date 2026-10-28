.class public final Lm93/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm93/g;


# static fields
.field public static final a:Lm93/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm93/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm93/c0;->a:Lm93/c0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final bridge b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "call/callBy are not supported for this declaration."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic getMember()Ljava/lang/reflect/Member;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 2

    const-string v0, "TYPE"

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method
